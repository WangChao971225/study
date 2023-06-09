package com.wangchao.javaee.course03_oop.java.properties;

/**
 * 总结：属性赋值的先后顺序
 *
 *      ① 默认初始化
 *      ② 显示初始化
 *      ③ 构造器中初始化
 *      ④ 通过"对象.setter方法" 或 "对象.属性"的方法，赋值
 *
 *      以上操作的先后顺序是： ① -> ② -> ③ -> ④
 */
public class Test {
    public static void main(String[] args) {
        User u = new User();

        System.out.println(u.age);

        User u1 = new User(2);

        u1.setAge(3);
        u1.setAge(5);

        System.out.println(u1.age);
    }
}

class User {
    String name;
    int age = 1;

    public User() {
    }

    public User(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
