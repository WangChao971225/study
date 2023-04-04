package com.wangchao.javaee.course09_collection.map;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Wang Chao
 * @create 2023/2/1 20:44
 */
public class PropertiesTest {

    //Properties：常用来处理配置文件，kry和value都是String类型
    public static void main(String[] args) throws Exception {
        String user = null;
        String password = null;
        FileInputStream fis = null;
        try {
            Properties pros = new Properties();

            fis = new FileInputStream("jdbc.properties");
            pros.load(fis);//加载流对应的文件

            user = pros.getProperty("user");
            password = pros.getProperty("password");

            System.out.println("user = " + user + ", password = " + password);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
