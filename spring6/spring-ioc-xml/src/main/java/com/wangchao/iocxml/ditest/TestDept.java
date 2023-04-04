package com.wangchao.iocxml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wang Chao
 * @create 2023/2/8 21:16
 */
public class TestDept {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-list.xml");

        Dept dept = context.getBean("dept", Dept.class);

        dept.showEmpList();
    }
}
