package com.wangchao.iocxml.dimap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wang Chao
 * @create 2023/2/8 21:31
 */
public class TestStudent {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-map.xml");

        Student student = context.getBean("student", Student.class);

        student.info();
    }
}
