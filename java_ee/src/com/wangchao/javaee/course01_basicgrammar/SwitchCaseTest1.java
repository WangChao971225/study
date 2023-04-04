package com.wangchao.javaee.course01_basicgrammar;
/*
例题：对学生成绩大于60分的，输出”合格“，低于60分的输出不合格。

多个case的执行结果一致，可以合并。从范围的边界值执行并break
 */
public class SwitchCaseTest1 {
    public static void main(String[] args) {
        int score = 60;

        //不可取, switch不太适用于范围值的情况
        /*switch(score) {
            case 1:
                //
            case 2:
                //
            case 3:
                // ...
            case 100:
                //
        }*/
        //多个case的执行结果一致，可以合并。
        switch(score/10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("不合格");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("合格");
                break;
        }

        //最优解
        switch(score/60) {
            case 0:
                System.out.println("不合格");
                break;
            case 1:
                System.out.println("合格");
                break;
        }

        //例题：根据用于指定月份，打印该月份所属的季节。
        //合并
        int month = 12;
        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("spring");
            case 4:
            case 5:
            case 6:
                System.out.println("summer");
            case 7:
            case 8:
            case 9:
                System.out.println("autumn");
            case 10:
            case 11:
            case 12:
                System.out.println("winter");
        }
    }
}
