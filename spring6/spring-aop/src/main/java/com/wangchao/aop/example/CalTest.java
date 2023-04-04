package com.wangchao.aop.example;

/**
 * @author Wang Chao
 * @create 2023/2/13 21:17
 */
public class CalTest {

    public static void main(String[] args) {
        //创建代理对象(动态)
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(3, 5);
    }
}
