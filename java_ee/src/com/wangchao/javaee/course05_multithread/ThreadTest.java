package com.wangchao.javaee.course05_multithread;

/**
 * <h3>多线程的创建，方式一：继承于Thread类</h3>
 *      1. 创建一个继承于Thread类的子类<br>
 *      2. 重写Thread类的run() --> 将此线程执行的操作声明在run()中 <br>
 *      3. 创建Thread类的子类对象<br>
 *      4. 通过此对象调用start()<br>
 * <p>
 * 例子：遍历100以内的所有偶数
 */
public class ThreadTest {
    public static void main(String[] args) {
        //3. 创建Thread类的子类对象
        MyThread t1 = new MyThread();

        //4. 通过此对象调用start(): ①启动当前线程 ②调用当前线程的run()
        t1.start();
        //注意：
        //问题1：直接调用run(),只是普通的对象调方法，还是单线程，只有通过start()才能开启线程
//        t1.run();
        //问题2：再启动一个相同线程，遍历100以内的偶数。不可以让已经start()的线程去执行，会报IllegalThreadStateException
//        t1.start();
        //我们需要重新创建一个新的Thread类的子类对象
        MyThread t2 = new MyThread();
        t2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + "Hello World!");
        }
    }
}

//1. 创建一个继承于Thread类的子类
class MyThread extends Thread {

    //2. 重写Thread类的run()
    @Override
    public void run() {
        //将此线程执行的操作声明在run()中
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
