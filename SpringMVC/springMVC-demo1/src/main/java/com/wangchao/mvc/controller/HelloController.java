package com.wangchao.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Wang Chao
 * @create 2023/2/20 13:13
 */
@Controller
public class HelloController {

    //  "/" --> /WEB-INF/templates/index.html
    @RequestMapping(value = "/")
    public String index() {
        //返回试图名称
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget() {
        return "target";
    }
}
