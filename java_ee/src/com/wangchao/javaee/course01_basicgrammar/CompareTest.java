package com.wangchao.javaee.course01_basicgrammar;
/*
运算符之三: 比较运算符
    == != > < >= <= instanceof

    结论：
    1.比较运算符的结果是boolean类型
    2.区分 == 和 =
 */
public class CompareTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;

        System.out.println(i == j);//false
        System.out.println(i = j);//将j赋值给i，再输出
    }
}
