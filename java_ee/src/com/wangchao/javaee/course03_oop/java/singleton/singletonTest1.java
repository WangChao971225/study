package com.wangchao.javaee.course03_oop.java.singleton;

/**
 * 单例(Singleton)设计模式
 *
 * 1. 设计模式：
 *      是在大量的实践中总结和理论化之后优选的代码结构、编程风格、以及解决问题的思考方式。
 *
 * 2.单例模式：
 *      就是采用一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例，并且该类只能提供一个
 *      取得对象实例的方法。
 *      如果我们要让类在一个虚拟机中只能产生一个对象，我们首先必须将类的构造器的访问权限设置为private，
 *      这样，就不能用new操作符在类的外部产生类的对象了，但在类内部仍可以产生该类的对象，因为在类的外部
 *      开始还无法得到类的对象，只能调用类的某个静态方法以返回类内部创建的对象，静态方法只能访问类中的静
 *      态成员变量，所以，指向类内部产生的该类对象的变量也必须定义成静态的。
 *
 * 3. 实现方法：
 *      饿汉式 vs 懒汉式
 *
 * 4. 区分饿汉式和懒汉式
 *      饿汉式：
 *          坏处：对象加载时间过长
 *          好处：线程安全的
 *      懒汉式：
 *          好处：延迟对象的创建
 *          坏处：线程不安全
 */
public class singletonTest1 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        System.out.println(bank1 == bank2);//true
    }
}

//饿汉式
class Bank {

    //1. 私有化类的构造器
    private Bank() {

    }

    //2. 内部创建类的对象
    //4. 要求此对象也必须声明为静态变量。(因为是静态变量，所以只存在一份)
    private static Bank instance = new Bank();

    //3. 提供公共的静态方法，返回类的对象
    public static Bank getInstance() {
        return instance;
    }
}
