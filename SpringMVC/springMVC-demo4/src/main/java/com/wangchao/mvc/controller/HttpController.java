package com.wangchao.mvc.controller;

import com.wangchao.mvc.bean.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Wang Chao
 * @create 2023/2/23 11:10
 */
@Controller
public class HttpController {

    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody) {
        System.out.println("requestBody: " + requestBody);
        return "success";
    }

    @RequestMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity) {
        //当前requestEntity标识整个请求报文的信息
        System.out.println("requestHeader:" + requestEntity.getHeaders());
        System.out.println("requestBody:" + requestEntity.getBody());
        return "success";
    }

    @RequestMapping("/testResponse")
    public void testResponse(HttpServletResponse response) throws IOException {
        //servlet API的响应方式
        response.getWriter().print("hello.response!");
    }
    @RequestMapping("/testResponseBody")
    @ResponseBody
    public String testResponseBody( ) {
        //加上@ResponseBody注解之后，就不再是返回视图，而是响应体内容
        return "hello,response body!";
    }

    @RequestMapping("/testResponseUser")
    @ResponseBody
    public User testResponseUser() {
        return new User(1, "张三", 32, "男", "zhang_san@qq.com");
    }

    @RequestMapping("/testAxios")
    @ResponseBody
    public String testAxios(String username, String password) {
        return username + ": " + password;
    }
}
