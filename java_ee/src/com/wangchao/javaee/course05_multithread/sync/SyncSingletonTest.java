package com.wangchao.javaee.course05_multithread.sync;

/**
 * 使用同步机制将单例模式中的懒汉式改成线程安全的
 *
 * @author Wang Chao
 * @create 2023/1/3 21:02
 */
public class SyncSingletonTest {


}

//懒汉式单例模式
class LazySingleton {

    private LazySingleton() {}

    private static LazySingleton instance  = null;

    //同步方法
//    public static synchronized LazySingleton getInstance() {
//        if (instance == null) {
//            instance =  new LazySingleton();
//        }
//
//        return instance;
//    }

    //同步代码块
    public static LazySingleton getInstance() {
        //方式一：效率稍差，一旦单例创建后，就不需要上锁了
//        synchronized (LazySingleton.class) {
//            if (instance == null) {
//                instance =  new LazySingleton();
//            }
//            return instance;
//        }

        //方式二：如果单例还没有创建，上锁；创建后直接返回
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;

    }
}
