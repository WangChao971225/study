package com.wangchao.javaee.course03_oop.java;

import org.junit.Test;

/**
 * Java的JUnit单元测试
 *
 * 步骤：
 * 1. 导包
 * 2. 创建Java类，进行单元测试。
 *    此时的Java类要求：① 此类是public的 ② 此类提供公共的无参构造器
 * 3. 此类中声明单元测试方法。
 *    此时的单元测试方法：方法的权限是public，没有返回值，没有形参
 * 4. 此单元测试方法上需要声明注解：@Test，并在单元测试类中导入： import org.junit.Test
 * 5. 声明好单元测试后，就可以在方法体内测试相关的代码
 *
 */
public class JUnitTest {
    @Test
    public void testEquals() {
        String s1 = "MM";
        String s2 = "MM";
        System.out.println(s1 == s2);
    }
}
