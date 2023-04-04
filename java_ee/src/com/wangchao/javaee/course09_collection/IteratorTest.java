package com.wangchao.javaee.course09_collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 使用Iterator接口遍历集合元素
 *
 *  内部的方法：
 *      hasNext()
 *      next()
 *      remove()
 *
 *  注意：集合对象每次调用iterator()方法得到一个全新的迭代器对象，
 *       默认游标都在集合的第一个元素之前。
 *
 * @author Wang Chao
 * @create 2023/1/17 20:22
 */
public class IteratorTest {

    @Test
    public void test1() {
        Collection coll = new ArrayList<Object>();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Tom", 20));
        coll.add(new String("Jerry"));
        coll.add(false);

        Iterator iterator = coll.iterator();

        //System.out.println(iterator.hasNext());
        //System.out.println(iterator.next());

        while (iterator.hasNext()) {
            System.out.println(iterator.next());//①指针下移 ②返回下移后集合位置上的元素
        }

    }
}
