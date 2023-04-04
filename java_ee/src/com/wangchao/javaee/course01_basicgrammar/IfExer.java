package com.wangchao.javaee.course01_basicgrammar;

public class IfExer {

    public static void main(String[] args) {
        //课后练习题：测算狗的年龄
        //狗前两年每一岁相当于人类的10.5岁, 之后每一年增加4岁。
        int dogAge = 2;
        if (dogAge > 0 && dogAge <= 2) {
            System.out.println("当前狗的年龄相当于人类的" + (dogAge * 10.5) + "岁");
        } else if (dogAge > 2) {
            System.out.println("当前狗的年龄相当于人类的" + (2 * 10.5 + (dogAge - 2) * 4) + "岁");
        } else {
            System.out.println("你的狗还没有出生！");
        }

    }
}
