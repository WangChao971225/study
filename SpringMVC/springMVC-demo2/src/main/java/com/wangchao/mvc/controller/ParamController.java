package com.wangchao.mvc.controller;

import com.wangchao.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

/**
 * @author Wang Chao
 * @create 2023/2/21 13:28
 */
@Controller
public class ParamController {

    @RequestMapping("/testServletAPI")
    //形参位置的request标识当前请求
    public String testServletAPI(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:" + username + ", password:" + password);
        return "success";
    }

    @RequestMapping("/testParam")
    public String testParam(
            @RequestParam(value = "user_name", required = false, defaultValue = "wangchao") String username,
            String password,
            String[] hobby,
            @RequestHeader(value = "Host", required = false, defaultValue = "ip:port") String host,
            @CookieValue(value = "Idea-9647b481", required = false, defaultValue = "no cookie") String cookie) {
        //若请求参数中出现多个同名的请求参数，可以在控制器方法的形参位置设置字符串类型或字符串数组接收此请求参数
        //若使用字符串类型的形参，最终结果为请求参数的每一个值之间使用逗号进行拼接
        System.out.println("username:" + username + ", password:" + password + ", hobby:" +  Arrays.toString(hobby));
        System.out.println("host:" + host);
        System.out.println("cookie:" + cookie);
        return "success";
    }

    @RequestMapping("/testPOJO")
    public String testPOJO(User user) {
        System.out.println(user);
        return "success";
    }
}
