package com.wangchao.javaee.course05_multithread.sync;

/**
 * 使用同步方法处理继承Tread类的方式中的线程安全问题
 *
 * @author Wang Chao
 * @create 2023/1/3 20:48
 */
class WindowMethod2 extends Thread {

    private static int ticket = 100;

    @Override
    public void run() {

        while(true) {
            sellTicket();
        }
    }

    private static synchronized void sellTicket() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
            ticket--;
        }
    }
}

public class SyncMethodTest2 {
    public static void main(String[] args) {
        WindowMethod2 w1 = new WindowMethod2();
        WindowMethod2 w2 = new WindowMethod2();
        WindowMethod2 w3 = new WindowMethod2();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
