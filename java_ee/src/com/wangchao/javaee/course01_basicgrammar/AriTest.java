package com.wangchao.javaee.course01_basicgrammar;
/*
运算符之一：算术运算符
    + -         正负号
    + - * /     四则运算
    %           取模
    ++ --       自增自减
    +           拼接
 */
public class AriTest {

    public static void main(String[] args) {

        //除号：
        int num1 = 12;
        int num2 = 5;
        int result1 = num1 / num2;
        System.out.println(result1);//2

        int result2 = num1 / num2 * num2;
        System.out.println(result2);//10

        double result3 = num1 / num2;//两个int进行除法之后的结果赋值给了一个double(也可以理解为手动类型提升)
        System.out.println(result3);//2.0

        double result4 = num1 / (num2 + 0.0);//将除数自动类型提升为浮点型
        System.out.println(result4);//2.4

        double result5 = num1 / (double)num2;//将除数强转为浮点型
        System.out.println(result5);//2.4

        //取模：
        int m1 = 12;
        int n1 = 5;
        System.out.println("m1 % n1 = " + m1 % n1);

        int m2 = -12;
        int n2 = 5;
        System.out.println("m2 % n2 = " + m2 % n2);

        int m3 = 12;
        int n3 = -5;
        System.out.println("m3 % n3 = " + m3 % n3);

        int m4 = -12;
        int n4 = -5;
        System.out.println("m4 % n4 = " + m4 % n4);
        
        //自增(++):
        int a1 = 10;
        int b1 = ++a1;  //前++,先自增1,后运算
        System.out.println("a1=" + a1 + ",b1=" + b1);//a1=11,b1=11

        int a2 = 10;
        int b2 = a2++;  //后++,先运算，后自增1
        System.out.println("a2=" + a2 + ",b2=" + b2);//a2=11,b2=10

        /* 注意点：自增1不改变本身变量的数据类型。
         *    使用普通加法进行+1操作的情况下, 1为int型常量,当与其他类型的数据进行计算的时候,可能会发生错误
         */
        short s1 = 10;
        //s1 = s1 + 1;//编译错误, int类型的结果无法赋值给short类型
        //s1 = (short) (s1 + 1);//进行强转
        s1++;   //可以使用, 故自增1不会改变本身变量的数据类型
        System.out.println(s1);

        //自减(--):
        int c1 = 10;
        int d1 = --c1;  //前--,先自减1,后运算
        System.out.println("c1=" + c1 + ",d1=" + d1);//c1=9,d1=9

        int c2 = 10;
        int d2 = c2--;  //后--,先运算，后自减1
        System.out.println("c2=" + c2 + ",d2=" + d2);//c1=9,d1=10
    }
}
