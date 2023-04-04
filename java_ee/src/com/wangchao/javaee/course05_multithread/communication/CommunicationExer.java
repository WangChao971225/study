package com.wangchao.javaee.course05_multithread.communication;

/**
 * 线程通信的应用：经典例题：生产者/消费者问题
 *
 * 生产者(Producer)将产品交给店员(Clerk),而消费者(Customer)从店员处取走产品，
 * 店员一次只能持有固定数量的产品(比如：20)，如果生产者试图生产更多的产品，店员
 * 会叫停生产，如果店中有空位放产品了，再通知生产者继续生产；如果店中没有产品了，
 * 店员会告诉消费者等一下，如果店中有产品了再通知来取走产品。
 *
 * 分析：
 * 1. 是否是多线程问题？ 是，生产者线程，消费者线程
 * 2. 是否有共享数据？ 是，店员(产品的数量)
 * 3. 如何来解决线程的安全问题？ 三种同步机制
 * 4. 是否设计到线程通信？ 是
 *
 * @author Wang Chao
 * @create 2023/1/4 19:55
 */
//店员（柜台）
class Clerk {
    private int productCount = 0;

    public synchronized void produceProduct() {
        if (productCount < 20) {
            System.out.println(Thread.currentThread().getName() + ":开始生产第" + ++productCount + "个产品");

            notify();
        } else {
            //停止生产(阻塞)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void consumeProduct() {
        if (productCount > 0) {
            System.out.println(Thread.currentThread().getName() + ":第" + productCount-- + "个产品被消费");

            notify();
        } else {
            //停止消费(阻塞)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//生产者
class Producer extends Thread{

    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + "开始生产...");

        while (true) {
            clerk.produceProduct();
        }
    }
}

//消费者
class Customer extends Thread{

    private Clerk clerk;

    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + "开始消费...");

        while (true) {
            clerk.consumeProduct();
        }
    }
}

public class CommunicationExer {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer p1 = new Producer(clerk);
        p1.setName("生产者1");

        Customer c1 = new Customer(clerk);
        c1.setName("消费者1");

        p1.start();
        c1.start();
    }
}
