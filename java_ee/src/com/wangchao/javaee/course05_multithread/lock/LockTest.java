package com.wangchao.javaee.course05_multithread.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全问题的方式三：Lock锁  ---JDK5.0 新增
 *
 * 1. 面试题： synchronized 与 Lock 的异同？
 *      相同：二者都可以解决线程安全问题
 *      不同：synchronized机制在执行完相应的同步代码以后，自动的释放同步监视器
 *           Lock需要手动的启动同步(lock()),同时结束同步也需要手动的实现(unlock())
 *
 * 2. 面试题：如何解决线程安全问题？有几种方式？
 *
 * @author Wang Chao
 * @create 2023/1/4 18:41
 */
class Window implements Runnable{

    private int ticket = 100;
    //使用实现了Lock的实现类ReentrantLock
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();

                Thread.sleep(100);

                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}

public class LockTest {
    public static void main(String[] args) {
        Window t1 = new Window();

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
