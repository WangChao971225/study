package com.wangchao.javaee.course02_array.exer;
/*
使用二维数组打印一个 10 行杨辉三角。

【提示】
 1. 第一行有 1 个元素, 第 n 行有 n 个元素
 2. 每一行的第一个元素和最后一个元素都是 1
 3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
        yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
 */
public class YangHuiTest {

    public static void main(String[] args) {
        //1.声明一个长度10的数组，数组存放的是int型数组
        int[][] arr = new int[10][];

        for (int i = 0; i < arr.length; i++) {
            //2.给数组赋值上与自己角标相同的数组作为二维数组
            arr[i] = new int[i + 1];

            //3.赋值首末元素为1
            arr[i][0] = arr[i][i] = 1;

            for (int j = 1; j < arr[i].length - 1; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }

        }
        
        //二维数组遍历输出
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
