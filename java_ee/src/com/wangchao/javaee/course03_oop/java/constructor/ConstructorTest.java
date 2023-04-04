package com.wangchao.javaee.course03_oop.java.constructor;

/**
 * 类的结构之三：构造器（或构造方法、constructor）的使用
 *
 *  construct：建设、建造
 *  construction：CCB 中国建设银行
 *  constructor：建设者
 *
 *  一、构造器的作用：
 *      1. 创建对象：new + 构造器(构造方法)
 *      2. 初始化对象的属性
 *
 *  二、说明：
 *      1. 如果没有显式的定义类的构造器的话，则程序默认提供一个空参的构造器；
 *      2. 定义构造器的格式：权限修饰符 类名(形参列表) {}
 *      3. 一个类中定义了多个构造器，彼此构成了重载
 *      4. 一旦我们显式的定义了类的构造器之后，系统就不再提供默认的空参构造器
 *      5. 一个类中，至少会有一个构造器。
 */
public class ConstructorTest {
    public static void main(String[] args) {
        //创建类的对象：new + 构造器(构造方法)
        Person person = new Person();

        Person tom = new Person("Tom", 22);
        System.out.println("This person is " + tom.getName() + ", he is " + tom.getAge() + " years old.");
    }
}

class Person {
    //属性
    String name;
    int age;
    //方法
    public void eat() {
        System.out.println("人吃饭");
    }
    public void study() {
        System.out.println("人学习");
    }
    //构造器
    //这个显示的定义一个空参构造器，如果不定义，会默认存在一个空参构造器
    public Person() {
        System.out.println("构建一个Person()对象......");
    }

    //重载构造器，对对象的属性进行初始化
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter方法
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
