package com.wangchao.javaee.course11_io.randomaccessfile;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile的使用
 * 1. RandomAccessFile直接继承于java.lang.Object类，实现了DataInput和DataOutput接口
 * 2. RandomAccessFile既可以作为一个输入流，也可以作为一个输出流
 *
 * 3. 如果RandomAccessFile作为输出流时，写出到的文件如果不存在，则在执行过程中自动创建。
 *    如果写出到的文件存在，则会对原有文件内容进覆盖。（默认情况下，从头覆盖）
 *
 * 4. 可以通过相关的操作，实现RandomAccessFile“插入”数据的效果
 *
 * 5. 可以用在多线程断点下载
 *
 * @author Wang Chao
 * @create 2023/2/5 14:40
 */
public class RandomAccessFileTest {
    @Test
    public void test1() throws IOException {
        RandomAccessFile ra1 = new RandomAccessFile(new File("遇见.jpg"), "r");
        RandomAccessFile ra2 = new RandomAccessFile(new File("遇见1.jpg"), "rw");

        byte[] buffer = new byte[1024];
        int len;
        while ((len = ra1.read(buffer)) != -1) {
            ra2.write(buffer, 0, len);
        }

        ra1.close();
        ra2.close();
    }

    @Test
    public void test2() throws IOException {
        RandomAccessFile ra = new RandomAccessFile(new File("hello.txt"), "rw");

        ra.seek(10);//将指针调到角标为3的位置
        ra.write("!!!".getBytes());

        ra.close();
    }

    /**
     * 使用RandomAccessFile实现数据的插入效果
     */
    @Test
    public void test3() throws IOException{
        RandomAccessFile rw = new RandomAccessFile(new File("hello1.txt"), "rw");

        rw.seek(3);//将指针调到角标为3的位置
        //保存指针3后面的所有数据到StringBuilder中
        StringBuilder builder = new StringBuilder((int) new File("hello1.txt").length());
        byte[] buffer = new byte[20];
        int len;
        while ((len = rw.read(buffer)) != -1) {
            builder.append(new String(buffer, 0, len));
        }

        //调回指针，写入"456"
        rw.seek(3);
        rw.write("456".getBytes());
        //将StringBuilder中的数据写入到文件中
        rw.write(builder.toString().getBytes());

        rw.close();

        //思考：将StringBuilder替换为ByteArrayOutputStream
    }
}
