package com.wangchao.javaee.course03_oop.java.singleton;

/**
 * 单例模式的懒汉式实现
 */
public class singletonTest2 {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();

        System.out.println(order1 == order2);
    }
}

class Order {

    //1. 私有化类的构造器
    private Order() {

    }

    //2. 内部创建类的对象
    //4. 要求此对象也必须声明为静态变量。(因为是静态变量，所以只存在一份)
    private static Order instance = null;

    //3. 提供公共的静态方法，返回实例对象
    public static Order getInstance() {
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }
}
