package com.wangchao.javaee.course05_multithread.exer;

/**
 * 银行有一个账户。
 * 有两个储户分别向同一个账户存3000元，每次存1000元，存3次，每次存完打印账户余额。
 *
 * ※分析
 * 1. 是否是多线程问题？ 是，有两个储户线程
 * 2. 是否有共享数据？ 有，账户
 * 3. 是否有线程安全问题？ 有
 * 4. 需要考虑如何解决线程安全问题？ 三种同步机制
 *
 * @author Wang Chao
 * @create 2023/1/4 19:04
 */
class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public synchronized void deposit(int amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println(Thread.currentThread().getName() + "用户存钱成功！当前余额为：" + balance + "元。");
        }

    }
}

class Customer extends Thread{
    private Account account;

    public Customer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(1000);
        }
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(0);
        Customer c1 = new Customer(account);
        Customer c2 = new Customer(account);

        c1.setName("甲");
        c2.setName("乙");

        c1.start();
        c2.start();
    }
}
