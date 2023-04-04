package com.wangchao.javaee.course03_oop.java.interefacetest;

/**
 * 接口的使用
 *
 * 1. 接口使用interface来定义
 * 2. Java中，接口和类是并列的两个结构
 * 3. 如何定义接口： 定义接口中的成员
 *      3.1 JDK7及以前：只能定义全局常量和抽象方法
 *          > 全局常量： public static final  ※书写时，可以省略不写
 *          > 抽象方法： public abstract ※书写时，可以省略不写
 *
 *      3.2 JDK8及以后：除了定义全局常量和抽象方法之外，还可以定义静态方法，默认方法
 *          > 知识点1：接口中定义的静态方法，只能通过接口来调用
 *          > 知识点2：通过实现类的对象，可以调用接口中的默认方法
 *          > 知识点3：默认方法可以被重写
 *          > 知识点4：如果子类(或实现类)继承的父类和实现的接口中声明了同名同参数的方法，
 *                    那么子类在没有重写此方法的情况下，默认调用的是父类中的同名同参数的方法  --> 类优先原则
 *
 * 4. 接口中不能定义构造器！！！  意味着接口是不可以被实现的
 *
 * 5. Java开发中，接口是通过让类去实现(implements)的方式来使用。
 *      > 如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
 *      > 如果实现类没有覆盖接口中的所有抽象方法，则此实现类仍然是一个抽象类
 *
 * 6. Java类可以实现多个接口   ——> 弥补了Java单继承性的局限性
 *      格式： class AA extends BB implements CC, DD, EE
 *
 * 7. 接口和接口之间可以继承，而且可以多继承
 *
 * 8. 接口的具体使用，体现了多态性
 *
 * 9. 接口，实际上可以看多是一种规范
 */
public class InterfaceTest {
}

interface Flyable{

    //全局常量
    public static final int MAX_SPEED = 7900;//第一宇宙速度
    int MIN_SPEED = 1;//省略了public static final，当依然是全局常量

    //抽象方法
    public abstract void fly();
    void stop();//省略了public abstract的抽象方法

    //Interfaces cannot have constructors  接口没有构造器
//	public Flyable(){
//
//	}
}

interface Attainable{

    void attack();

}

class plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}

class Bullet extends Object implements Flyable, Attainable{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }
}
