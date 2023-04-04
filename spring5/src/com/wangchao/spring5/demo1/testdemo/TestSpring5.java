package com.wangchao.spring5.demo1.testdemo;

import com.wangchao.spring5.demo1.Book;
import com.wangchao.spring5.demo1.Orders;
import com.wangchao.spring5.demo1.User;
import com.wangchao.spring5.demo1.bean.Emp;
import com.wangchao.spring5.demo1.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {

    @Test
    public void testAdd() {
        //1 加载spring 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2 获取配置创建对象
        User user = context.getBean("user", User.class);

        //3 测试
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook1() {
        //1 加载spring 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2 获取配置创建对象
        Book book = context.getBean("book", Book.class);

        //3 测试
        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testOrders() {
        //1 加载spring 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2 获取配置创建对象
        Orders orders = context.getBean("orders", Orders.class);

        //3 测试
        System.out.println(orders);
        orders.testOrders();
    }

    @Test
    public void testService() {
        //1 加载spring 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        //2 获取配置创建对象
        UserService userService = context.getBean("userService", UserService.class);

        //3 测试
        System.out.println(userService);
        userService.add();
    }

    @Test
    /**
     * 内部Bean 测试
     */
    public void testInnerBean() {
        //1 加载spring 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        //2 获取配置创建对象
        Emp emp = context.getBean("emp", Emp.class);

        //3 测试
        System.out.println(emp);
    }

    @Test
    /**
     * 级联赋值 测试
     */
    public void test() {
        //1 加载spring 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        //2 获取配置创建对象
        Emp emp = context.getBean("emp", Emp.class);

        //3 测试
        System.out.println(emp);
    }
}
