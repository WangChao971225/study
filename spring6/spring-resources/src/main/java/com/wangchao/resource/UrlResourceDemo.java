package com.wangchao.resource;

import org.springframework.core.io.UrlResource;

import java.net.MalformedURLException;

/**
 * 演示UrlResource访问网络资源
 *
 * @author Wang Chao
 * @create 2023/2/16 18:55
 */
public class UrlResourceDemo {

    public static void main(String[] args) {
        //http前缀
        loadUrlResource("http://www.baidu.com");

        //file前缀
        loadUrlResource("file:atguigu.txt");
    }

    //访问前缀http、file
    public static void loadUrlResource(String path) {

        //创建Resource实现类的对象 UrlResource
        try {
            //创建Resource实现类的对象 UrlResource
            UrlResource url = new UrlResource(path);

            //获取资源信息
            System.out.println(url.getFilename());
            System.out.println(url.getURL());
            System.out.println(url.getDescription());
            System.out.println(url.getInputStream().read());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
