package com.wangchao.javaee.course01_basicgrammar;
/*
运算符之四: 逻辑运算符
    & && | || ！^

    说明：
    1.逻辑运算符操作的都是boolean类型
 */
public class LogicTest {
    public static void main(String[] args) {

        /*区分& 和 &&
            相同点: 1.& 和 && 的运算结果相同
                   2.当符号的左边为true时， 二者都会执行右边的运算
            不同点: 当符号左边是false时, &逻辑与继续执行符号右边的运算, &&短路与不再执行符号右边的运算

            开发中推荐使用短路与&&
         */
        boolean b1 = false;
        int num1 = 10;
        if (b1 & (num1++ > 0)) {
            System.out.println("我家住在北京~");
        } else {
            System.out.println("我家住在南京~");
        }
        System.out.println("num1 = " + num1);

        boolean b2 = false;
        int num2 = 10;
        if (b2 && (num2++ > 0)) {
            System.out.println("我家住在北京~");
        } else {
            System.out.println("我家住在南京~");
        }
        System.out.println("num2 = " + num2);

        /*区分 | 和 ||
            相同点: 1.| 和 || 的运算结果相同
                   2.当符号的左边为false时， 二者都会执行右边的运算
            不同点: 当符号左边是true时, |逻辑与继续执行符号右边的运算, ||短路与不再执行符号右边的运算

            开发中推荐使用短路或||
         */
        boolean b3 = true;
        int num3 = 10;
        if (b3 | (num3++ > 0)) {
            System.out.println("我家住在北京~");
        } else {
            System.out.println("我家住在南京~");
        }
        System.out.println("num3 = " + num3);

        boolean b4 = true;
        int num4 = 10;
        if (b4 || (num4++ > 0)) {
            System.out.println("我家住在北京~");
        } else {
            System.out.println("我家住在南京~");
        }
        System.out.println("num4 = " + num4);
    }
}
