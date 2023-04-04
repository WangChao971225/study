package com.wangchao.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Wang Chao
 * @create 2023/2/25 15:15
 */
@Controller
public class TestController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
