package com.wangchao;

import com.wangchao.bean.AnnotationApplicationContext;
import com.wangchao.bean.ApplicationContext;
import com.wangchao.service.UserService;

/**
 * @author Wang Chao
 * @create 2023/2/13 20:23
 */
public class TestUser {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationApplicationContext("com.wangchao");
        UserService userService = (UserService) context.getBean(UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
