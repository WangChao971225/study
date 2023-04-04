package com.wangchao.javaee.course07_enum;

/**
 * 一、枚举类的使用
 *  1. 枚举类的理解：类的对象只有有限个，确定的。我们称之为枚举类。
 *  2. 当需要定义一组常量时，强烈推荐使用枚举类。
 *  3. 如果枚举类中只有一个对象，则可以作为单例模式的实现方式。
 *
 * 二、如何定义枚举类
 *  方式一：JDK5.0之前，自定义枚举类
 *  方式二：JDK5.0，可以使用enum关键字定义枚举类
 *
 * 三、Enum类中的常用方法
 *  values()：返回枚举类型的对象数组，该方法可以很方便地遍历所有枚举值。
 *  valueOf(String str)：可以把一个字符串转为对应的枚举类对象。要求字符串必须是枚举类的对象。
 *  toString()：返回当前枚举类对象常量的名称
 *
 * 四、使用enum关键字定义的枚举类实现接口的情况
 *  情况一：实现接口，在enum类中实现接口的抽象方法
 *  情况二：让枚举类中的对象分别实现接口的抽象方法
 *
 *
 * @author Wang Chao
 * @create 2023/1/16 19:11
 */
public class SeasonTest {
    public static void main(String[] args) {
        Season autumn = Season.AUTUMN;
        System.out.println(autumn.toString());
    }
}

//自定义枚举类
class Season {
    //1.声明Season对象的属性
    private final String seasonName;
    private final String seasonDesc;

    //2.私有化类的构造器
    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3.提供当前枚举类的多个对象
    public static final Season SPRING = new Season("春天", "春暖花开");
    public static final Season SUMMER = new Season("夏天", "夏日炎炎");
    public static final Season AUTUMN = new Season("秋天", "秋高气爽");
    public static final Season WINTER = new Season("冬天", "冰天雪地");

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
