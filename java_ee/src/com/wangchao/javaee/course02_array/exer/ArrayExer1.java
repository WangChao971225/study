package com.wangchao.javaee.course02_array.exer;
/*
使用简单数组
拓展：修改题目，实现array2对array1数组的复制
 */
public class ArrayExer1 {

    public static void main(String[] args) {
        int[] array1,array2;

        array1 = new int[]{2,3,5,7,11,13,17,19};

        //显示数组1 的内容
        System.out.println("数组1："  + array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println();

        //数组的复制
        array2 = new int[array1.length];//定义数组的长度
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }

        //显示数组2 的内容
        System.out.println("数组2："  + array2);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");
        }
        System.out.println();
    }
}
