package com.wangchao.javaee.course03_oop.java.keyword;

import java.util.Arrays;

/**
 * import关键字的使用
 *  import：导入
 *  1.在源文件中显式的使用import结构导入指定包下的类，接口
 *  2.声明在包的声明和类声明之间
 *  3.如果需要导入多个结构，则并列写出即可
 *  4.可以使用"xxx.*"的方式，表示可以导入xxx包下的所有结构
 *  5.如果使用的类或接口是java.lang包下定义的，则可以省略import结构
 *  6.如果使用的类或者接口是本包下定义的，则可以省略import结构
 *  7.如果在源文件中，使用了不同包下的同名类，则必须至少有一个类需要以全类名的方式显示
 *  8.使用"xxx.*"方法表明可以使用xxx包下的所有结构，但是如果是xxx子包下的结构，则仍然需要显式的导包
 *
 *  9.import static: 导入指定类或接口中的静态结构
 */
public class ImportTest {
    public static void main(String[] args) {
        //导入java.util.Arrays
        String arr = Arrays.toString(new int[]{1, 2, 3});
    }
}
