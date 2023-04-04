package com.wangchao.resource;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * 访问类路径下资源
 *
 * @author Wang Chao
 * @create 2023/2/16 19:03
 */
public class ClassPathResourceDemo {

    public static void main(String[] args) {
        loadClasspathResource("atguigu.txt");
    }

    public static void loadClasspathResource(String path) {
        //创建对象ClassPathResource
        ClassPathResource resource = new ClassPathResource(path);

        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());

        //获取文件内容
        try {
            InputStream is = resource.getInputStream();

            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, len));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
