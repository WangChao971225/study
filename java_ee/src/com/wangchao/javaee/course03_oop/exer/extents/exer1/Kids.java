package com.wangchao.javaee.course03_oop.exer.extents.exer1;

/**
 * 定义类Kids继承ManKind，并包括
 *  成员变量
 *      int yearsOld
 *  方法
 *      printAge()打印yearsOld的值。
 */
public class Kids extends ManKind {
    private int yearsOld;

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge() {
        System.out.println("I am " + yearsOld + "years old.");
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}
