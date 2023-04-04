package com.wangchao.javaee.course03_oop.java.template;

/**
 * 抽象类的引用：模板方法的设计模式
 */
public class TemplateTest {
    public static void main(String[] args) {
        Template template = new SubTemplate();

        template.spendTime();
    }
}

abstract class Template{

    //计算某段代码所需要的时间
    public void spendTime() {
        long start = System.currentTimeMillis();

        code();//易变的部分

        long end = System.currentTimeMillis();

        System.out.println("花费的时间为：" + (end - start));
    }

    public abstract void code();
}

class SubTemplate extends Template{

    @Override
    public void code() {
        //求1000以为的质数
        for (int i = 2; i < 1000; i++) {
            boolean isFlag = true;
            for (int j = 2; j < Math.sqrt(i); j++) {

                if(i % j == 0) {
                    isFlag = false;
                    break;
                }
            }
            if (isFlag){
                System.out.println(i);
            }
        }
    }
}
