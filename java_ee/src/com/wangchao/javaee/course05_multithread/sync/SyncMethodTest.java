package com.wangchao.javaee.course05_multithread.sync;

/**
 * 使用同步方法解决实现Runnable接口的线程安全问题
 *
 *  关于同步方法的总结：
 *  1. 同步方法仍然涉及到同步监视器，只是不需要显示的声明；
 *  2. 非静态的同步方法，同步监视器是： this
 *     静态的同步方法，同步监视器是： 当前类的本身
 *
 * @author Wang Chao
 * @create 2023/1/3 20:30
 */
class WindowMethod implements Runnable {

    private int ticket = 100;

    @Override
    public void run() {

        while(true) {
            sellTicket();
        }
    }

    private synchronized void sellTicket() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
            ticket--;
        }
    }
}

public class SyncMethodTest {
    public static void main(String[] args) {
        WindowMethod t1 = new WindowMethod();

        Thread w1 = new Thread(t1);
        Thread w2 = new Thread(t1);
        Thread w3 = new Thread(t1);

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
