package com.wangchao.javaee.course03_oop.java.innerclass;

/**
 * 类的成员之五：内部类
 * 1. Java中允许将一个类A声明在另一个类B中，则类A就是内部类，类B称为外部类
 *
 * 2. 内部类的分类： 成员内部类(静态、非静态)  VS  局部内部类(方法内、代码块内、构造器内)
 *
 * 3. 成员内部类：
 *      一方面，作为外部类的成员：
 *          > 调用外部内的结构
 *          > 可以被static修饰
 *          > 可以使用权限修饰符
 *
 *      另一方面，作为一个类：
 *          > 类内可以定义属性、方法、构造器等
 *          > 可以被final修饰
 *          > 可以被abstract修饰
 *
 * 4. 关注
 *      4.1 如何实例化成员内部类的对象
 *      4.2 如果在成员内部类中调用外部类的结构
 *      4.3 开发中局部内部类的使用
 */
public class InnerClassTest {
    public static void main(String[] args) {
        //创建Hand实例(静态的成员内部类)
        Person.Hand hand = new Person.Hand();
        hand.show();

        //创建Face实例(非静态的成员内部类)
        Person p = new Person();
        Person.Face face = p.new Face();
        face.show();
    }
}

class Person{

    //成员内部类
    class Face {
        String name;
        int age;

        public void show() {
            System.out.println("我是脸");

            Person.this.method();//调用外部类的非静态结构
        }
    }
    static class Hand {
        String name;
        int age;

        public void show() {
            System.out.println("我是手");
        }
    }

    //方法中
    public void method() {
        //局部内部类
        class AA {

        }
    }

    //代码块中
    {
        //局部内部类
        class BB {

        }
    }

    //构造器中

    public Person() {
        //局部内部类
        class CC {

        }
    }
}
