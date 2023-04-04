package com.wangchao.javaee.course12_network;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 实现TCP的网络编程
 * 例题2：客户端发送文件给服务器端，服务器将文件保存在本地。
 *
 * @author Wang Chao
 * @create 2023/2/5 19:09
 */
public class TCPTest2 {
    //客户端
    @Test
    public void client() throws IOException {
        //1.创建Socket对象，指明服务器端的ip和端口号
        Socket socket = new Socket("127.0.0.1", 8899);
        //2.通过socket对象来获取输出流，用来传输数据
        OutputStream os = socket.getOutputStream();
        //3.创建一个输入流来获取文件
        FileInputStream fis = new FileInputStream(new File("遇见.jpg"));
        //4.数据的读取和写出
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }
        //5.资源的关闭
        fis.close();
        os.close();
        socket.close();
    }

    //服务端
    @Test
    public void server() throws IOException {
        //1.创建服务器的ServerSocket，指明自己的端口号
        ServerSocket ss = new ServerSocket(8899);
        //2.调用accept()表示接收来自客户端的socket
        Socket socket = ss.accept();
        //3.通过socket对象来过去输入流
        InputStream is = socket.getInputStream();
        //4.创建输出流，指明输出位置
        FileOutputStream fos = new FileOutputStream("遇见socket.jpg");

        //5.数据的读入和写出操作
        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }

        //6.流的关闭
        fos.close();
        is.close();
        ss.close();
    }
}
