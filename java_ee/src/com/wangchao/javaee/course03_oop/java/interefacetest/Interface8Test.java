package com.wangchao.javaee.course03_oop.java.interefacetest;

/**
 * JDK8及之后：除了定义全局变量和抽象方法之外，还可以定义静态方法、默认方法
 */
public class Interface8Test {

    public static void main(String[] args) {
        //创建一辆摩托车
        Motorcycle motorcycle = new Motorcycle();

        //知识点1：接口中定义的静态方法，只能通过接口来调用
        //错误写法
//        motorcycle.startUp();
//        Motorcycle.startUp();
        //正确写法
        Runnable.startUp();

        //知识点2：通过实现类的对象，可以调用接口中的默认方法
        motorcycle.drive();

        //知识点3：默认方法可以被重写
        motorcycle.accelerate();

        //知识点4：如果子类(或实现类)继承的父类和实现的接口中声明了同名同参数的方法，
        //        那么子类在没有重写此方法的情况下，默认调用的是父类中的同名同参数的方法  --> 类优先原则
        motorcycle.stop();
    }
}

interface Runnable{

    //静态方法
    public static void startUp() {
        System.out.println("启动");
    }

    //默认方法
    public default void drive(){
        System.out.println("驾驶");
    }

    default void stop() {
        System.out.println("停止");
    }

    default void accelerate() {
        System.out.println("加速");
    }

}

class Cycle {
    public void stop(){
        System.out.println("使用手把刹车");
    }
}

class Motorcycle extends Cycle implements Runnable{
    public void accelerate() {
        System.out.println("转动手把,加速");
    }
}
