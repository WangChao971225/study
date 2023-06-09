package com.wangchao.javaee.course06_common.string;

import org.junit.Test;

/**
 * String 的使用
 *
 * @author Wang Chao
 * @create 2023/1/5 19:02
 */
public class StringTest {

    /**
     * String : 字符串, 使用一对 "" 引起来表示。
     * 1. String声明为final的，不可被继承
     * 2. String实现了Serializable接口：表示字符串是支持序列化的。
     *          实现了Comparable接口：表示String可以比较大小。
     * 3. String内部定义了final char[] value 用于存储字符串数据
     * 4. String表示不可变的字符序列。简称：不可变性
     *      体现：① 当对字面量重新赋值时，需要重写指定区域赋值，不能使用原有的value进行赋值。
     *           ② 当对现有的字符串进行连接操作时，也需要重新指定内存区域赋值，不能使用原有的value进行赋值。
     *           ③ 当调用String的replace()方法修改指定的字符串或字符时，也需要重新指定内存内存区域赋值，不能使用原有的value进行赋值。
     * 5. 通过字面量的方式(区别与new的方式)给一个字符串赋值，此时的字符串声明在字符串常量池中。
     * 6. 字符串常量池中是不会存储相同内容的字符串。
     */
    @Test
    public void test1() {
        String s1 = "abc";
        String s2 = "abc";

        System.out.println(s1 == s2);
        System.out.println(s1 == new Bank("abc").getName());

        String s3 = s1.replace('a', 'n');
        System.out.println(s3);
    }

    /**
     * String的实例化方式：
     *  ① 通过字面量定义的方式
     *  ② 通过new 构造器的方式
     *
     * 面试题：String s = new String("abc"); 方式创建对象，在内存中创建了几个对象？
     *  答：两个，一个是在堆空间中new的结构，另一个是char[]对应的常量池中的数据: "abc"
     */
    @Test
    public void test2() {
        //通过字面量定义的方式：此时的s1和s2的数据声明在方法去中的字符串常量池中
        String s1 = "javaEE";
        String s2 = "javaEE";
        //通过new 构造器的方式：此时的s3和s4保存的地址值，是数据在堆空间中开辟空间以后对应的地址值。
        String s3 = new String("javaEE");
        String s4 = new String("javaEE");

        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//false
        System.out.println(s1 == s4);//false
        System.out.println(s3 == s4);//false

    }

    /**
     * 结论：
     *     1.常量与常量的拼接结果在常量池。且常量池中不会存在相同内容的常量。
     *     2.只要其中有一个是变量，结果就在堆中。
     *     3.如果拼接的结果调用intern()方法，返回值就在常量池中
     */
    @Test
    public void test3(){
        String s1 = "javaEE";
        String s2 = "hadoop";

        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s3 == s7);//false
        System.out.println(s5 == s6);//false
        System.out.println(s5 == s7);//false
        System.out.println(s6 == s7);//false

        String s8 = s6.intern();//返回值得到的s8使用的常量值中已经存在的“javaEEhadoop”
        System.out.println(s3 == s8);//true
    }


    class Bank {
        private String name;

        public String getName() {
            return name;
        }

        public Bank(String name) {
            this.name = name;
        }
    }
}
