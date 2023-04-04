package com.wangchao.javaee.course11_io.inputstreamreader;

import org.junit.Test;

import java.io.*;

/**
 * 处理流之二：转换流的使用
 * 1. 转换流：属于字符流
 *      InputStreamReader： 将一个字节的输入流转为字符的输入流
 *      OutputStreamWriter：将一个字符的输出流转为字节的输出流
 *
 * 2. 作用：提供字节流和字符流之间的转换
 *
 * 3. 解码：字节、字节数组 --> 字符、字符数组
 *    编码：字符、字符数组 --> 字节、字节数组
 *
 * 4. 字符集
 *      ASCII：美国信息交换标准代码
 *          用一个字节的7位可以表示。
 *      ISO8859-1：拉丁文码。欧洲码表
 *          用一个字节的8位可以表示。
 *      GB2312：中国的中文编码表。最多两个字节编码表示所有字符
 *      GBK：中国的中文编码表的升级，融合了更多的中文文字符号，最多两个字节编码
 *      Unicode：国际标准码，融合了目前人类使用的所有字符，为每个字符分配一个字符码。所有的文字都用两个字节来表示
 *      UTF-8：变长的编码方式，用1-4个字节来表示一个字节
 *
 * @author Wang Chao
 * @create 2023/2/4 15:26
 */
public class InputStreamReaderTest {

    /*
    此时处理异常的话，仍然应该使用try-catch-finally
    InputStreamReader的使用，实现字节的输入流到字符的输入流的转换
     */
    @Test
    public void test1() throws IOException {

        FileInputStream fis = new FileInputStream("dbcp.txt");
//        InputStreamReader isr = new InputStreamReader(fis);//使用系统默认的字符集
        //参数2指明了字符集，具体使用哪个字符集，取决于文件dbcp.txt保存时使用的字符集
        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");//使用系统默认的字符集

        char[] cbuf = new char[20];
        int len;
        while((len = isr.read(cbuf)) != -1){
            String str = new String(cbuf,0,len);
            System.out.print(str);
        }

        isr.close();

    }

    /*
此时处理异常的话，仍然应该使用try-catch-finally

综合使用InputStreamReader和OutputStreamWriter
 */
    @Test
    public void test2() throws Exception {
        //1.造文件、造流
        File file1 = new File("dbcp.txt");
        File file2 = new File("dbcp_gbk.txt");

        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");

        //2.读写过程
        char[] cbuf = new char[20];
        int len;
        while((len = isr.read(cbuf)) != -1){
            osw.write(cbuf,0,len);
        }

        //3.关闭资源
        isr.close();
        osw.close();


    }

}
