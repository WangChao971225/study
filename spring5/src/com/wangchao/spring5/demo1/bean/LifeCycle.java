package com.wangchao.spring5.demo1.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * spring管理 bean的生命周期
 */
public class LifeCycle {

    private String id;

    //无参构造
    public LifeCycle() {
        System.out.println("第一步 执行无参构造创建bean实例");
    }

    //setter 方法
    public void setId(String id) {
        this.id = id;
        System.out.println("第二步 调用setter方法设置属性值");
    }

    //创建执行的初始化方法
    public void initMethod() {
        System.out.println("第三步 执行初始化方法");
    }

    //创建执行的销毁方法
    public void destroyMethod() {
        System.out.println("第五步 执行销毁的方法");
    }
}
