package com.wangchao.springi18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Wang Chao
 * @create 2023/2/16 19:27
 */
public class ResourceI18n {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        Locale locale = Locale.UK;

        Object[] objs = new Object[] {context.getMessage("beijing", new Object[] {}, locale), new Date().toString()};

        String value = context.getMessage("welcome", objs, locale);
        System.out.println(value);
    }
}
