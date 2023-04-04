package com.wangchao.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Wang Chao
 * @create 2023/2/22 8:52
 */
@Controller
public class JspController {

    @RequestMapping("/success")
    public String success() {
        return "success";
    }
}
