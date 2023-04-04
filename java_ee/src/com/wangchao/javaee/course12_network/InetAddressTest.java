package com.wangchao.javaee.course12_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 一、网络编程中有两个主要的问题：
 *  1.如何准确地定位网络上一台或多台主机；定位主机上的特定的应用；
 *  2.找到主机后如何可靠高效地进行数据传输
 *
 * 二、网络编程中的两个要素：
 *  1.对应问题一：IP和端口号
 *  2.对应问题二：提供网络通信协议：TCP/IP参考模型(应用层、传输层、网络层、物理+数据链路层)
 *
 * 三、通信要素一：IP和端口号
 *  ※ IP
 *      1.IP：唯一的标识 Internet 上的计算机(通信实体)
 *      2.在Java中使用InetAddress类标识IP
 *      3.IP分类：IPv4 和 IPv4；  万维网(公网) 和 局域网(内网、私网)
 *      4.域名： www.baidu.com
 *      5.DNS：域名解析服务器
 *      6.本地回路地址：127.0.0.1 --> localhost
 *
 *      7.如何实例化InetAddress：两个方法：getByName(String host) 、 getLocalHost()
 *        两个常用方法：getHostName() / getHostAddress()
 *
 *  ※ 端口号
 *      1.端口号：正在计算机上运行的进程编号。
 *      2.要求：不同的进程有不同的端口号
 *
 *  注：IP地址和端口号的组合得出一个网络套接字：Socket
 *
 * @author Wang Chao
 * @create 2023/2/5 15:44
 */
public class InetAddressTest {

    public static void main(String[] args) {
        try {
            //相当与File类一样将文件封装成对象，这里是将网络信息封装成对象
            InetAddress inet1 = InetAddress.getByName("www.baidu.com");//百度的IP地址：14.215.177.39

            InetAddress inet2 = InetAddress.getByName("localhost");//本地回路地址：127.0.0.1
            InetAddress localHost = InetAddress.getLocalHost();//直接通过getLocalHost()获取本地回路地址

            System.out.println(inet1);
            System.out.println(inet2);
            System.out.println(localHost);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
