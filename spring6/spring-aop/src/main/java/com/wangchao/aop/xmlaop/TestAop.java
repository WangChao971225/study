package com.wangchao.aop.xmlaop;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wang Chao
 * @create 2023/2/13 21:52
 */
public class TestAop {

    @Test
    public void testAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanaop.xml");
        Calculator calculator = context.getBean(Calculator.class);
        calculator.add(2, 3);
    }
}
