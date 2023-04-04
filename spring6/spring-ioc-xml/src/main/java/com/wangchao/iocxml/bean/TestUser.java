package com.wangchao.iocxml.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wang Chao
 * @create 2023/2/8 19:30
 */
public class TestUser {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //1.根据id获取bean
        User user1 = (User) context.getBean("user");
        System.out.println("1 根据id获取bean：" + user1);

        //2.根据class获取bean
        //当根据类型获取bean时，要求IOC容器中指定类型的bean有且只有一个
        //当IOC中配置个两个相同类型的bean，就会抛出异常：
        //No qualifying bean of type 'com.wangchao.iocxml.bean.User' available: expected single matching bean but found 2: user,user1
//        User user2 = context.getBean(User.class);
//        System.out.println("2 根据class获取bean" + user2);

        //3.根据id和class获取bean
        User user3 = context.getBean("user", User.class);
        System.out.println("3 根据id和class获取bean" + user3);
    }
}
