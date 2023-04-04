package com.wangchao.javai18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Wang Chao
 * @create 2023/2/16 19:27
 */
public class ResourceI18n {

    public static void main(String[] args) {
        ResourceBundle bundle1 = ResourceBundle.getBundle("message", new Locale("zh", "CN"));
        String value1 = bundle1.getString("test");
        System.out.println(value1);

        ResourceBundle bundle2 = ResourceBundle.getBundle("message", new Locale("en", "GB"));
        String value2 = bundle2.getString("test");
        System.out.println(value2);
    }
}
