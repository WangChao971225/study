package com.wangchao.javaee.course03_oop.java.encapsulation;

/**
 * 面向对象的特征一：封装与隐藏
 *
 * 一、问题的引入：
 *      当我们创建一个类的对象后，我们可以通过"对象.属性"的方式，对对象的属性进行赋值，这里，赋值操作要受到
 *      属性的数据类型和存储范围制约。除此之外，没有其他的制约条件，但是，在实际问题中， 我们往往需要给属性
 *      赋值加入额外的限制条件。这个条件不能在属性声明时体现，我们只能通过方法进行限制条件的添加。(比如setXxx())
 *      同时，我们需要避免用户在使用"对象.属性"的方式进行赋值，则需要将属性声明为私有的(private)
 *
 *      -->此时，针对于属性就体现了封装性。
 *
 * 二、封装性的体现：
 *      我们将类的属性xxx私有化(private),同时，提供公共的(public)方法来获取(getXxx)和设置(setXxx)此属性的值，以实现下述目的：
 *          1.隐藏一个类中不需要对外提供的实现细节；
 *          2.使用者只能通过事先定制好的方法来访问数据，可以方便地加入控制逻辑， 限制对属性的不合理操作；
 *          3.便于修改，增强代码的可维护性；
 *
 *      拓展：封装性的体现：① 如上  ② 不对外暴露的私有的方法  ③ 单例模式   ...
 *
 * 三、封装性的体现，需要权限修饰符来配合。
 *      1.Java规定的4种权限（从小到大排列）：private、缺省、protected 、public
 *      2.4种权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
 *      3.具体的，4种权限都可以用来修饰类的内部结构：属性、方法、构造器、内部类
 *             修饰类的话，只能使用：缺省、public
 */
public class AnimalTest {

    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.name = "皮卡";
        animal.age = 2;
        //animal.legs = 4;
        animal.setLegs(4);

        animal.show();
    }
}

class Animal {
    String name;
    int age;
    private int legs;//腿的个数

    //对隐藏的属性进行设置
    public void setLegs(int legs) {
        if(legs >= 0 && legs % 2 == 0) {
            this.legs = legs;
        } else {
            this.legs = 0;
        }
    }

    //获取隐藏的属性值
    public int getLegs() {
        return this.legs;
    }

    public void  eat() {
        System.out.println("动物吃饭");
    }

    public void show(){
        System.out.println("name = " + name + ",age = " + age + ",legs = " + legs);
    }

    /*
        idea 通过Alt + Ins生产getter和setter方法
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
