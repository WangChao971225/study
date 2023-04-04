package com.wangchao.javaee.course07_enum;

/**
 * 使用enum关键字定义枚举类
 *
 * 说明：定义的枚举类默认继承于java.lang.Enum类
 *
 * @author Wang Chao
 * @create 2023/1/16 19:30
 */
public class SeasonEnum {
    public static void main(String[] args) {
        Season1 spring = Season1.SPRING;
        System.out.println(spring.toString());

        System.out.println(Season1.class.getSuperclass());

        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            values[i].show();
        }

        System.out.println(Season1.valueOf("SPRING"));
    }
}

interface Info {
    void show();
}

//自定义枚举类
enum Season1 implements Info{

    //1.提供当前枚举类的对象，多个对象之间用逗号隔开，末尾对象用分号
    SPRING("春天", "春暖花开") {
        @Override
        public void show() {
            System.out.println("春天在哪里");
        }
    },
    SUMMER("夏天", "夏日炎炎") {
        @Override
        public void show() {
            System.out.println("宁夏");
        }
    },
    AUTUMN("秋天", "秋高气爽") {
        @Override
        public void show() {
            System.out.println("秋天不回来");
        }
    },
    WINTER("冬天", "冰天雪地") {
        @Override
        public void show() {
            System.out.println("那一年的冬天");
        }
    };

    //2.声明Season对象的属性
    private final String seasonName;
    private final String seasonDesc;

    //3.私有化类的构造器
    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
}


