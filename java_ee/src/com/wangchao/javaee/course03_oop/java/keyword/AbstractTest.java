package com.wangchao.javaee.course03_oop.java.keyword;

/**
 * abstract关键字的使用
 * 1. abstract：抽象的
 * 2. abstract可以用来修饰：类，方法
 *
 * 3. abstract修饰类： 抽象类
 *      > 此类不能实例化
 *      > 抽象类中一定有构造器，便于子类实例化时调用(涉及：子类对象实例化的全过程)
 *      > 开发中，都会提供抽象类的子类，让子类对象实例化，完成相关操作
 *
 * 4. abstract修饰方法： 抽象方法
 *      > 抽象方法只有方法的声明，没有方法体
 *      > 包含抽象方法的类，一定是一个抽象类，反之，抽象类中可以没有抽象方法
 *      > 若子类重写了父类中的所有抽象方法后，此子类方可实例化
 *        若子类没有重写父类中的所有抽象方法，则此子类依然是一个抽象类
 *
 * 5. abstract使用上的注意点：
 *      ① 只能用来修饰类和方法，不能用来修饰属性、构造器等结构
 *      ② 不能和以下关键字一起使用：
 *          private： abstract方法必须被其子类重修才有意义，子类无法访问父类的private方法及无法重写；
 *          static: 静态方法表示该方法属于这个类本身的，即通过类就可以调用该抽象方法的话就会出现错误(调用没有方法体的方法)；
 *          final: final修饰的类永远无法被继承，而抽象类的作用就是为了让子类继承，矛盾了。
 *                 final修饰的方法永远无法被重写，而抽象方法的作用就是为了让子类进行重写，矛盾了。
 */
public class AbstractTest {
    //'Human' is abstract; cannot be instantiated
    //一旦类抽象了，就不能被实例化
//    Human h1 = new Human();
//    h1.eat();
}

abstract class Human{
    String name;
    int age;

    public Human(){

    }
    //普通方法
    public void eat(){
        System.out.println("吃饭");
    }
    //抽象方法
    public abstract void sleep();
}

class Man extends Human{
    public void sleep(){
        System.out.println("男人睡觉会打呼噜~~");
    }
}

