package com.wangchao.javaee.course05_multithread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 *  创建线程的方式三：实现Callable接口。 --- JDK 5.0 新增
 *
 *  1. 创建一个实现Callable的实现类
 *  2. 实现Call方法，将此线程需要执行的操作声明在call()中，call()可以有返回值
 *  3. 创建Callable接口实现类的对象
 *  4. 将此Callable接口实现类的对象作为参数传递到FutureTask构造器中
 *  5. 将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start()
 *  6. 获取Callable中call方法的返回值
 *
 *  提问：
 *  如何理解实现Callable接口的方式比实现Runnable接口的方式更强大？
 *  1. call()可以有返回值。
 *  2. call()可与抛出异常，被外面的操作捕获，获取异常信息。
 *  3. Callable是支持泛型的。
 *
 * @author Wang Chao
 * @create 2023/1/4 20:46
 */
//1. 创建一个实现Callable的实现类
class NumThread implements Callable {
    //2. 实现Call方法，将此线程需要执行的操作声明在call()中，call()可以有返回值
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            sum += i;
        }

        return sum;
    }
}

public class CallableTest {
    public static void main(String[] args) {
        //3. 创建Callable接口实现类的对象
        NumThread n1 = new NumThread();
        //4. 将此Callable接口实现类的对象作为参数传递到FutureTask构造器中
        FutureTask f1 = new FutureTask(n1);
        //5. 将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start()
        Thread t1 = new Thread(f1);

        t1.start();

        try {
            Object sum = f1.get();
            System.out.println("1-100的总和为：" + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
