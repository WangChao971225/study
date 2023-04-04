package com.wangchao.javaee.course05_multithread.sync;

/**
 * 例子： 创建三个窗口卖票，总票数为100张，使用实现Runnable接口的方式
 *
 * 1. 问题：卖票的过程中，出现了重票、错票 --> 出现了线程的安全问题
 * 2. 问题出现的原因：当某个线程操作车票的过程中，尚未操作完成时，其他线程参与进来，也操作车票
 * 3. 如何解决：当一个线程a再操作ticket的时候，其他线程不能参与进来，直到线程a操作完ticket时，
 *            其他线程才可以操作ticket。这种情况即使线程a出现了阻塞，也不能被改变。
 * 4. 在Java中，我们通过同步机制，来解决线程的安全问题
 *
 * 方式一：同步代码块
 *
 *  synchronized(同步监视器) {
 *      //需要被同步的代码
 *
 *  }
 *
 *  说明：1.操作共享数据的代码，即为需要被同步的代码
 *       2.共享数据：多个线程共同操作的变量，比如：ticket就是共享数据。
 *       3.同步监视器，俗称：锁。
 *          ※任何一个类的对象，都可以充当锁
 *          ※要求多个线程必须要共用同一把锁！！！  可以使用(当前类的对象/当前类)来充当
 *
 *  方式二：同步方法    见 SyncMethodTest.java
 *      如果操作共享数据的代码完整的声明在一个方法中，我们不妨将此方法声明为同步的。
 *
 *      关于同步方法的总结：
 *          1. 同步方法仍然涉及到同步监视器，只是不需要显示的声明；
 *          2. 非静态的同步方法，同步监视器是： this
 *             静态的同步方法，同步监视器是： 当前类的本身
 *
 *  5. 同步的方式的优缺点
 *      优点：解决了线程的安全问题。
 *      缺点：操作同步代码时，只能有一个线程参与，其他线程等待，相当于一个单线程的过程，效率低。
 */
class WindowRun implements Runnable {

    private int ticket = 100;
//    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (this) {//synchronized (obj) { 使用当前类的对象
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ":买票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class SyncWindowTest {
    public static void main(String[] args) {
        WindowRun windowRun = new WindowRun();
        Thread w1 = new Thread(windowRun);
        Thread w2 = new Thread(windowRun);
        Thread w3 = new Thread(windowRun);

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
