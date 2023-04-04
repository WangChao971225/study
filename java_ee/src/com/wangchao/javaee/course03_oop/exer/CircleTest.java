package com.wangchao.javaee.course03_oop.exer;

/*
 *  2.利用面向对象的编程方法，设计类Circle计算圆的面积
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 2.0;
        System.out.println("圆的面积为：" + circle.findArea());
    }
}

class Circle {
    //属性
    double radius;

    //方法
    public double findArea() {
        return 3.14 * radius * radius;
    }
}
