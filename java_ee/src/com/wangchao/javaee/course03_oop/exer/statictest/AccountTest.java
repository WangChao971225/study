package com.wangchao.javaee.course03_oop.exer.statictest;

/*
    编写一个类实现银行账号的概念，包含的属性有"账号"、"密码"、"存款余额"、"利率"、"最小余额"
    定义封装这些属性的方法，账号要自动生成。
        编写主类，使用银行账号类、输入、输出3个账号的上述信息。
        考虑：哪些属性可以设计成static属性
 */
public class AccountTest {

    public static void main(String[] args) {
        Account acct1 = new Account();
        Account acct2 = new Account("mima9292", 1000.0);
        Account acct3 = new Account("ymslx-2020", 5000.0);

        Account.setInterestRate(0.012);
        Account.setMinMoney(100);

        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);
    }
}
