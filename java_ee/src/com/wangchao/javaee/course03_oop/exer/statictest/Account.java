package com.wangchao.javaee.course03_oop.exer.statictest;

/*
    编写一个类实现银行账号的概念，包含的属性有"账号"、"密码"、"存款余额"、"利率"、"最小余额"
    定义封装这些属性的方法，账号要自动生成。
        编写主类，使用银行账号类、输入、输出3个账号的上述信息。
        考虑：哪些属性可以设计成static属性
 */
public class Account {
    private int id;
    private String pwd = "000000";
    private double balance;

    private static double interestRate;
    private static double minMoney = 1.0;
    private static int init = 1001;//用于自动生成id使用

    public Account() {
        this.id = init++;
    }

    public Account(String pwd, double balance) {
        this.id = init++;
        this.pwd = pwd;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance +
                '}';
    }
}
