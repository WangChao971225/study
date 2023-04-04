package com.wangchao.spring6;

/**
 * @author Wang Chao
 * @create 2023/2/7 20:32
 */
public class User {

    public void add() {
        System.out.println("add...");
    }

    public static void main(String[] args) {
        //使用spring之前，传统的创建对象的方式
        User user = new User();
        user.add();
    }
}
