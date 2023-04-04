package com.wangchao.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author Wang Chao
 * @create 2023/2/21 19:06
 */
@Controller
public class ScopeController {

    //使用servletAPI像request域对象设置共享数据
    @RequestMapping("/testRequestByServletAPI")
    public String testRequestByServletAPI(HttpServletRequest request) {
        request.setAttribute("testRequestScope", "hello,servletAPI");
        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        ModelAndView mav = new ModelAndView();
        //处理模型数据，即向请求域request共享数据
        mav.addObject("testRequestScope", "hello, ModelAndView");
        //设置视图，实现页面跳转
        mav.setViewName("success");
        return mav;
    }

    @RequestMapping("/testModel")
    public String testModel(Model model) {
        //处理模型数据，即向请求域request共享数据
        model.addAttribute("testRequestScope", "hello, Model");
        return "success";
    }

    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map) {
        //处理模型数据，即向请求域request共享数据
        map.put("testRequestScope", "hello, Map");
        return "success";
    }

    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap) {
        //处理模型数据，即向请求域request共享数据
        modelMap.addAttribute("testRequestScope", "hello, ModelMap");
        return "success";
    }

    @RequestMapping("/testSession")
    public String testSession(HttpSession session) {
        //处理模型数据，即向请求域session共享数据
        session.setAttribute("testSessionScope", "hello, Session");
        return "success";
    }

    @RequestMapping("/testApplication")
    public String testApplication(HttpSession session) {
        ServletContext servletContext = session.getServletContext();
        //处理模型数据，即向请求域session共享数据
        servletContext.setAttribute("testApplicationScope", "hello, Application");
        return "success";
    }
}
