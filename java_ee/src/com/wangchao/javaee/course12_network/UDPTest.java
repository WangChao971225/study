package com.wangchao.javaee.course12_network;

import org.junit.Test;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

/**
 * UDP协议的网络编程
 *
 *
 * @author Wang Chao
 * @create 2023/2/6 11:33
 */
public class UDPTest {
    //发送端
    @Test
    public void send() throws IOException {
        //创建DatagramSocket对象
        DatagramSocket socket = new DatagramSocket();

        String str = "UDP发送数据测试！";
        byte[] data = str.getBytes();

        //获取接收端的ip信息
        InetAddress inet = InetAddress.getByName("127.0.0.1");
        //创建DatagramPacket对象存放数据和接收端信息
        DatagramPacket packet = new DatagramPacket(data, 0, data.length, inet, 8899);

        //通过DatagramSocket对象来发送信息
        socket.send(packet);

        //资源关闭
        socket.close();
    }

    //接收端
    @Test
    public void receive() throws IOException {
        //创建DatagramSocket对象
        DatagramSocket socket = new DatagramSocket(8899);

        byte[] buffer = new byte[100];
        DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length);
        socket.receive(packet);

        System.out.println(new String(packet.getData(), 0, packet.getLength()));
        socket.close();
    }
}
