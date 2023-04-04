package com.wangchao.javaee.course01_basicgrammar;
/*
运算符之一：赋值运算符
    = += -= *= /= %=
 */
public class SetValueTest {
    public static void main(String[] args) {
        //赋值符号: =
        int i1 = 10;
        int j1 = 10;

        //连续声明
        int i2, j2;
        //连续赋值
        i2 = j2 = 10;
        //连续声明赋值
        int i3 = 10, j3 = 20;

        //*********************
        int num1 = 10;
        num1 += 2;  //num1 = num1 + 2;
        System.out.println(num1);//12

        int num2 = 12;
        num2 %= 5;
        System.out.println(num2);

        //*********************

        /* 注意点：+=不改变本身变量的数据类型。
         *    使用普通加法进行 + int型常量 操作的情况下,当与其他类型的数据进行计算的时候,可能会发生错误
         */
        short s1 = 10;
        //s1 = s1 + 2;//编译失败
        s1 += 2;//不会改变变量本身的数据类型
        System.out.println(s1);
    }
}
