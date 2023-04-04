package com.wangchao.iocxml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wang Chao
 * @create 2023/2/8 20:46
 */
public class TestEmp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
        //员工对象
        Emp emp = (Emp) context.getBean("emp", Emp.class);
        emp.work();

        Emp emp2 = (Emp) context.getBean("emp2", Emp.class);
        emp2.work();

        Emp emp3 = (Emp) context.getBean("emp3", Emp.class);
        emp3.work();

        ApplicationContext context2 = new ClassPathXmlApplicationContext("bean-array.xml");
        Emp emp4 = (Emp) context2.getBean("emp4", Emp.class);
        emp4.work();
    }
}
