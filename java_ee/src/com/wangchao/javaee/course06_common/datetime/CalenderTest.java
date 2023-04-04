package com.wangchao.javaee.course06_common.datetime;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * Calender日历类是的使用
 * @author Wang Chao
 * @create 2023/1/10 21:24
 */
public class CalenderTest {

    /**
     * Calender日历类(抽象类)的使用
     */
    @Test
    public void test() {
        //1.实例化
        //方式1：创建其子类(GregorianCalendar)的对象
        //方式2：调用其静态方法getInstance();
        Calendar calendar = Calendar.getInstance();

        //2.常用方法
        //get()
        int days = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);
        System.out.println(Calendar.DAY_OF_YEAR);

        //set()
        //Calendar可变性
        calendar.set(Calendar.DAY_OF_MONTH, 22);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //add()
        calendar.add(Calendar.DAY_OF_MONTH, -3);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //getTime(): 日历类 --> Date
        Date date = calendar.getTime();
        System.out.println(date);

        //setTime(): Date类 --> 日期类
        calendar.setTime(new Date());
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
