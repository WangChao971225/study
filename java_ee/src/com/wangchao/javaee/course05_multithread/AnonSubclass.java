package com.wangchao.javaee.course05_multithread;

/**
 * 练习：
 *      创建两个分线程，其中一个线程遍历100以内的偶数，其中一个线程遍历100以内的奇数
 */
public class AnonSubclass {

    //因为子类只使用一次，所有采用匿名子类的方式来实现
    public static void main(String[] args) {

        //线程1：遍历100以内的偶数
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("偶数");
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();

        //线程2：遍历100以内的奇数
        new Thread() {
            @Override
            public void run() {
                Thread.currentThread().setName("奇数");
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 1) {
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();
    }
}
