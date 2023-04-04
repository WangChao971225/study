package com.wangchao.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Wang Chao
 * @create 2023/2/20 16:02
 */
@Controller
@RequestMapping("/hello") //标识一个类上：设置映射请求的请求路径的初始信息
public class RequestMappingController {

    @RequestMapping(
            value = {"testRequestMapping", "/test"},
            method = {RequestMethod.GET}
    )
    public String success() {
        return "success";
    }

    @GetMapping("/testGetMapping")
    public String testGetMapping() {
        return "success";
    }

    // 405 - 方法不允许
    // Request method 'GET' not supported
    @RequestMapping(value = "/testPut", method = RequestMethod.PUT)
    public String testPut(){
        return "success";
    }

    @RequestMapping(
            value = "/testParamsAndHeaders",
            //400 - 错误的请求
            //Parameter conditions "username, password=123456" not met for actual request parameters: username={admin}, password={123}
            params = {"username","password=123456"},
            //404 - 未找到
            headers = {"Host=localhost:8080"}
    )
    public String testParamsAndHeaders(){
        return "success";
    }

    //@RequestMapping("/a?a/testAnt")
    //@RequestMapping("/a*a/testAnt")
    @RequestMapping("/a/**/testAnt")
    public String testAnt () {
        return "success";
    }

    @RequestMapping("/testPath/{id}/{username}")
    public String testPath (@PathVariable("id") String id, @PathVariable("username") String username) {
        System.out.println("id:" + id + ", username:" + username);
        return "success";
    }

    //此时请求映射所映射的请求的请求路径为：/test/testRequestMapping
    @RequestMapping("/testRequestMapping")
    public String index() {
        return "success";
    }
}
