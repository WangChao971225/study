package com.wangchao.javaee.course02_array.java;
/*
一、数组的概述
1.数组的理解:
    数组(Array),是多个相同类型数据按一定顺序排列的集合，并使用一个名字命名，
    并通过编号的方式对这些数据进行统一管理。

2.数组的概念：
    数组名、元素、角标(下标、索引)、数组的长度(元素的个数)

3.数组的特点：
    ①数组是有序排列的;
    ②数组属于引用数据类型的变量,但数组的元素可以是基本数据类型,也可以是引用数据类型;
    ③创建数组对象会在内存中开辟一整块连续的空间;
    ④数组的长度一旦却确定了就无法修改;

4.数组的分类：
    ① 按照维数：一维数组,二维数组。。。
    ② 按照数组元素的类型：基本数据类型元素的数组、引用数据类型元素的数组

5. 一维数组的使用
    ① 一维数组的声明和初始化
    ② 如何调用数组的指定位置的元素
    ③ 如何获取数组的长度
    ④ 如何遍历数组
    ⑤ 数组元素的默认初始化值
        > 整型数组元素: 0
        > 浮点型数组元素: 0.0
        > char型数组元素: 0 或 '\u0000'， 而非'0'
        > 布尔型数组元素: false
        > 引用数据类型数组元素: null
    ⑥ 数组的内存解析
 */
public class ArrayTest {
    public static void main(String[] args) {
        //1.一维数组的声明和初始化
        //变量的声明和初始化
        int num;//声明
        num = 10;//赋值
        int id = 1001;//声明+初始化

        //数组的声明和初始化
        int[] ids;//声明
        //1.1静态初始化：数组的初始化和数组元素的赋值操作同时进行。
        ids = new int[]{1001, 1002, 1003, 1004};
        //1.2动态初始化：数组的初始化和数组元素的赋值操作分开进行。
        String[] names = new String[5];//声明长度为5

        //错误的写法：
//      int[] arr1 = new int[];
//      int[5] arr2 = new int[5];
//      int[] arr3 = new int[3]{1,2,3};

        //也是正确的写法：
        int[] arr = {1,2,3,4,5};//类型推断

        //总结：数组一旦初始化完成，其长度就确定了。

        //2.如何调用数组指定位置的元素———通过角标的方式调用
        //数组的角标(或索引)从0开始，到数组的长度-1结束。
        names[0] = "张三";
        names[1] = "李四";
        names[2] = "王五";
        names[3] = "赵六";
        names[4] = "孙七";
//      names[5] = "周八";//java.lang.ArrayIndexOutOfBoundsException: 5 (数组角标越界)

        //3.如何获取数组的长度
        System.out.println(ids.length);//4
        System.out.println(names.length);//5

        //4.如何遍历数组
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //5.数组元素的默认初始化值
        int[] arr1 = new int[1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("整型数组元素的默认初始化值: " + arr1[i]);//0
        }

        float[] arr2 = new float[1];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("浮点型数组元素的默认初始化值: " + arr2[i]);//0.0
        }

        char[] arr3 = new char[1];
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("char型数组元素的默认初始化值: " + arr3[i]);//0 或 '\u0000'， 而非'0'
        }

        boolean[] arr4 = new boolean[1];
        for (int i = 0; i < arr4.length; i++) {
            System.out.println("布尔型数组元素的默认初始化值: " + arr4[i]);//false
        }

        String[] arr5 = new String[1];
        for (int i = 0; i < arr5.length; i++) {
            System.out.println("引用数据类型数组元素的默认初始化值: " + arr5[i]);//null
        }
    }
}
