package com.wangchao.javaee.course09_collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * JDK 5.0 新增 foreach 循环，用于遍历集合、数组
 *
 * @author Wang Chao
 * @create 2023/1/25 18:23
 */
public class ForeachTest {

    @Test
    public void test1() {
        Collection coll = new ArrayList();

        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);

        //for (集合元素的类型 局部变量 : 集合对象)
        //内部使用的是迭代器
        for (Object o : coll) {
            System.out.println(o);
        }

    }

    @Test
    public void test2() {
        String[] arr = new String[]{"MM", "MM", "MM"};
        String[] arr1 = new String[]{"MM", "MM", "MM"};

        //通过for循环的方式进行修改
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "GG"; //直接修改数组元素的值
        }

        //增强for循环
        for (String s : arr1) {
            //从数组中返回的值赋给新的变量s
            //修改变量s而不是修改数组元素的值
            s = "GG";
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
