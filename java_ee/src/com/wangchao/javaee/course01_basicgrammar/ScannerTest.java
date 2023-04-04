package com.wangchao.javaee.course01_basicgrammar;
/*
如何从键盘获取不同类型的变量：需要使用Scanner类

具体步骤：
1.导包：import java.util.Scanner;
2.Scanner 的实例化： Scanner scan = new Scanner(System.in);
3.调用Scanner类的相关方法(next() / nextXxx())，来获取指定类的相关变量

注意：
需要根据相应的方法，来输入指定类型的值。如果输入的数据类型与要求的类型不匹配时，
会报异常：InputMisMatchException，导致程序终止。
 */
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        //Scanner的实例化：
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入你的名字：");
        String name = scan.next();
        System.out.print("请输入你的年龄：");
        int age = scan.nextInt();
        System.out.print("请输入你的身高（米）：");
        float height = scan.nextFloat();

        System.out.println("您的姓名：" + name);
        System.out.println("您的年龄：" + age);
        System.out.println("您的身高：" + height + "米");
    }
}
