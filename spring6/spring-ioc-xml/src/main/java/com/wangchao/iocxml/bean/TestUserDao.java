package com.wangchao.iocxml.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wang Chao
 * @create 2023/2/8 19:44
 */
public class TestUserDao {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //根据类型获取接口对应bean
        //当IOC容器中有两个接口实现类的bean，将抛出异常
        //No qualifying bean of type 'com.wangchao.iocxml.bean.UserDao'
        //available: expected single matching bean but found 2: userDaoImpl,personDaoImpl
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println(userDao);
        userDao.ren();
    }
}
