package com.wangchao.javaee.course03_oop.java.wrapper;

import org.junit.Test;

/**
 * 包装类的使用：
 * 1. Java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
 *
 * 2. 掌握的：基本数据类型、包装类、String三者之间的相互转换
 */
public class WrapperTest {

    @Test
    //基本数据类型 —> 包装类： 调用包装类的构造器
    public void test1() {
        int num1 = 10;
        Integer int1 = new Integer(num1);
        System.out.println(int1.toString());

        Integer int2 = new Integer("123");
        System.out.println(int2.toString());

        Float f1 = new Float(12.3f);
        Float f2 = new Float("12.3");
        System.out.println(f1);
        System.out.println(f2);

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("false");
        System.out.println(b1);
        System.out.println(b2);
        /* Boolean类能解析其他字符的原因
            public static boolean parseBoolean(String s) {
                return ((s != null) && s.equalsIgnoreCase("true"));
            }
         */
        Boolean b3 = new Boolean("true123");
        System.out.println(b3);
    }

    @Test
    //包装类 —> 基本数据类型：调用包装类的xxxValue()
    public void test2() {
        Integer int1 = new Integer(12);
        int i1 = int1.intValue();
        float f1 = int1.floatValue();
        System.out.println(i1 + 1);//转换成基本数据类型后可以进行运算
        System.out.println(f1);
    }

    @Test
    //JDK5.0 新特性： 自动装箱与自动拆箱
    public void  test3() {
        //自动装箱：基本数据类型 —> 包装类
        int i1 = 10;
        Integer int1 = i1;//自动装箱  不需要在通过new 包装类的构造器

        //自动拆箱：包装类 —> 基本数据类型
        Integer int2 = new Integer(20);
        int i2 = int2;//自动拆箱   不需要再通过包装类的对象.xxxValue()的方法转换为基本数据类型
    }

    @Test
    //基本数据类型、包装类 ——> String类型
    public void test4() {
        int i1 = 10;
        Integer int1 = 10;
        //第一种方式：拼接空字符串(连接运算)
        String s1 = i1 + "";
        String s2 = int1 + "";
        System.out.println(s1);
        System.out.println(s2);
        //第二种方式：调用String重载的valueOf(Object obj)方法
        System.out.println(String.valueOf(i1));
        System.out.println(String.valueOf(int1));
    }

    @Test
    //String类型 ——> 基本数据类型、包装类
    public void test5() {
        String s1 = "123";

        Integer int1 = Integer.getInteger(s1);//是根据指定的名称得到系统属性的整数值。
        System.out.println(int1);//调用Integer.getInteger("521") 应该是得到 null（系统默认肯定没有521的系统属性）。

        int i1 = Integer.parseInt(s1);
        System.out.println(i1);

        String s2 = "true";
        boolean b1 = Boolean.parseBoolean(s2);
        System.out.println(b1);
    }
}
