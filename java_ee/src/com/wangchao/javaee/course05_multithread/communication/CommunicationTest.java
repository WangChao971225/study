package com.wangchao.javaee.course05_multithread.communication;

/**
 * 线程的通信
 *     例子：使用两个线程打印1-100，线程1和线程2 交替打印
 *
 * 涉及到的三个方法：
 *      wait(): 一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器！
 *      notify(): 一旦执行此方法，就会唤醒被wait的一个线程。如果有多个线程被wait，就唤醒优先级高的那个。
 *      notifyALl(): 一旦执行此方法，就会唤醒所有被wait的一个线程。
 *
 * 说明：
 *      1. wait(),notify(),notifyALl() 三个方法必须使用在同步代码块或同步方法中。
 *      2. wait(),notify(),notifyALl() 三个方法的调用者必须是同步代码块或同步方法中的同步监视器(锁)
 *          否则，会出现IllegalMonitorStateException异常
 *      3. wait(),notify(),notifyALl() 三个方法定义在Object类中
 *
 * 面试题：sleep() 和 wait() 的异同
 *      相同：一旦执行方法，都可以使当前的线程进入阻塞状态
 *      不同：① 两个方法声明的位置不同：sleep()声明在Thread类中，wait()声明在Object类中
 *           ② 调用的范围不同：sleep()可以在任意需要的场景下调用，wait()必须使用在同步代码块或同步方法中
 *           ③ 关于是否释放同步监视器：sleep()不会释放锁，wait()会释放锁
 *
 * @author Wang Chao
 * @create 2023/1/4 19:25
 */
class Number implements Runnable {
    private int number = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                //使用notify()结束某一个线程的阻塞状态
                notify();

                if (number <= 100) {
                    System.out.println(Thread.currentThread().getName() + ":" + number++);

                    try {
                        //使得调用如下wait()方法的线程进入阻塞状态
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}

public class CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();

        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
