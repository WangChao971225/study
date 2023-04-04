package com.wangchao.spring5.demo1.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcess implements BeanPostProcessor {

    //前置处理器：初始化前执行
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("后置处理器：在初始化之前执行的方法");
        return bean;
    }

    //后置处理器：初始化后执行
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("后置处理器：在初始化之后执行的方法");
        return bean;
    }
}
