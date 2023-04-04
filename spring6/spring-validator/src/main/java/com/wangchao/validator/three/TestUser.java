package com.wangchao.validator.three;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Wang Chao
 * @create 2023/2/16 20:29
 */
public class TestUser {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyService service = context.getBean(MyService.class);
        User user = new User();
        user.setName("张三");
        user.setAge(25);
        user.setPhone("15967949596");
        service.testMethod(user);
    }
}
