package com.wangchao.spring5.demo1.testdemo;

import com.wangchao.spring5.demo1.bean.LifeCycle;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleTest {

    /**
     * bean 的生命周期测试
     */
    @Test
    public void lifeCycleTest() {
        //1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");

        //2 获取配置创建对象
        LifeCycle lifeCycle = context.getBean("lifeCycle", LifeCycle.class);

        //3 输出对象
        System.out.println("第四步 获取创建bean对象实例：" + lifeCycle);

        //4 手动销毁
        ((ClassPathXmlApplicationContext) context).close();
    }
}
