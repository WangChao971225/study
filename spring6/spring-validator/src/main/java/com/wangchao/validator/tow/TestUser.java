package com.wangchao.validator.tow;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Wang Chao
 * @create 2023/2/16 20:17
 */
public class TestUser {

    @Test
    public void testValidationOne() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);

        MyValidation1 validation1 = context.getBean(MyValidation1.class);

        User user = new User();
        user.setName("张三");
        user.setAge(250);

        boolean message = validation1.validatorByUserOne(user);

        System.out.println(message);
    }

    @Test
    public void testValidationTwo() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyValidation2 validation2 = context.getBean(MyValidation2.class);

        User user = new User();
        user.setName("lucy");
        user.setAge(200);

        boolean message = validation2.validatorByUserTwo(user);
        System.out.println(message);

    }
}
