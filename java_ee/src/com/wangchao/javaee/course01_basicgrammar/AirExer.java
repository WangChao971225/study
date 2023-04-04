package com.wangchao.javaee.course01_basicgrammar;
/*
算术运算符练习题:
    任意给出一个三位数的整数，打印显示它的个位数、十位数、百位数的值
    格式如下：
        数字xxx的情况如下：
        个位数：
        十位数：
        百位数：
 */
public class AirExer {
    public static void main(String[] args) {
        int num = 369;

        System.out.println("数字" + num + "的情况如下：");
        System.out.println("个位数：" + num / 100);
        System.out.println("十位数：" + num % 100 / 10);
        System.out.println("百位数：" + num % 10);
    }
}
