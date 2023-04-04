package com.wangchao.javaee.course03_oop.java.object.tostring;

import com.wangchao.javaee.course03_oop.java.object.equals.Customer;

/**
 * Object类中toString()的使用：
 *
 * 1. 当我们输出一个对象的引用时，实际上就是调用当前对象的toString()
 *
 * 2. Object类中toString()的定义：
 *  public String toString() {
 *      return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *  }
 *
 *  3. 像String、Date、File、包装类等都重写了Object类中的toString()方法、
 *     使得在调用对象的toString()时，返回“实体内容”信息。
 *
 *  4. 自定义类也可以重写同String()方法，当调用此方法时，返回对象的"实体内容"
 */
public class ToStringTest {

    public static void main(String[] args) {

        Customer cust1 = new Customer("Tom", 21);
        //com.wangchao.javaee.course3_oop.java.object.equals.Customer@1b6d3586
        System.out.println(cust1.toString());//输出地址值
    }
}
