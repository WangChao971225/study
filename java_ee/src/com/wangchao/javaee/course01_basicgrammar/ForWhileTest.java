package com.wangchao.javaee.course01_basicgrammar;

import java.util.Scanner;

/*
例题: 从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。

说明：
1. 不在循环条件部分限制次数的结构：for(;;) 或 while(true)     不限循环次数
2. 结束循环有几种方式？
    方式一：循环条件部分返回false
    方式二：再循环体中，执行break
 */
public class ForWhileTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 1;
        int positiveCount = 0;//记录正数的个数
        int negativeCount = 0;//记录负数的个数

        System.out.println("请输出整数：");

        while (num != 0) {
            num = scan.nextInt();

            if (num > 0) {
                positiveCount++;
            }
            if (num < 0) {
                negativeCount++;
            }
        }
        System.out.println("输入的正数个数为：" + positiveCount);
        System.out.println("输入的负数个数为：" + negativeCount);
    }
}
