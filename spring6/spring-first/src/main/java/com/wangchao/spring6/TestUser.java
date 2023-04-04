package com.wangchao.spring6;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Wang Chao
 * @create 2023/2/7 20:44
 */
public class TestUser {

    //创建Logger对象手动写日志
    private Logger logger = LoggerFactory.getLogger(TestUser.class);

    @Test
    public void testUserObject() {
        //1.加载spring配置文件，对象创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //2.获取创建的对象
        User user = (User) context.getBean("user");
        System.out.println(user);

        //3.使用对象调用方法进行测试
        user.add();

        //手动写日志
        logger.info("~~~ 执行成功了....");
    }

    //使用反射创建对象
    @Test
    public void testUserObject1() throws Exception {
        //获取Class对象
        Class<User> clazz = (Class<User>) Class.forName("com.wangchao.spring6.User");
        //通过方法创建对象
        //Object o = clazz.newInstance(); 已过时
        User user = clazz.getConstructor().newInstance();
        user.add();
    }
}
