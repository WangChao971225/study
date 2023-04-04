package com.wangchao.javaee.course12_network;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * URL网络编程
 * 1.URL：统一资源定位符，对应着互联网的某一资源地址
 * 2.格式：
 *  http://localhost:8080/examples/test.jpg?user=Tom
 *  协议    主机名     端口号  资源地址          参数列表
 *
 * @author Wang Chao
 * @create 2023/2/6 12:06
 */
public class URLTest {

    @Test
    public void testURL() {
        URL url = null;
        try {
            url = new URL("https://i0.hdslb.com/bfs/article/b59244ea428d9bd8b92c0d3bc327eb7f790003f4.png?user=Tom");

            //getProtocol() 获取该URL的协议名
            System.out.println(url.getProtocol());
            //getHost() 获取该URL的主机名
            System.out.println(url.getHost());
            //getPort() 获取该URL的端口号
            System.out.println(url.getPort());
            //getPath() 获取该URL的文件路径
            System.out.println(url.getPath());
            //getFile() 获取该URL的文件名
            System.out.println(url.getFile());
            //getQuery() 获取该URL的查询名
            System.out.println(url.getQuery());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

    @Test

    public void testURL2() throws IOException {

        URL url = new URL("https://i0.hdslb.com/bfs/article/b59244ea428d9bd8b92c0d3bc327eb7f790003f4.png?user=Tom");

        HttpURLConnection urlConnection =(HttpURLConnection) url.openConnection();

        urlConnection.connect();

        InputStream is = urlConnection.getInputStream();

        FileOutputStream fos = new FileOutputStream("托尔.jpg");

        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }

        is.close();
        fos.close();
        urlConnection.disconnect();
    }

}
