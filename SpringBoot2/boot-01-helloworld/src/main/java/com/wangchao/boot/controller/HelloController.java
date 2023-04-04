package com.wangchao.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wang Chao
 * @create 2023/2/26 15:50
 */
/*@Controller
@RequestMapping*/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handle01() {
        return "Hello, SpringBoot 2.X !";
    }
}
