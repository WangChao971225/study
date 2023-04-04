package com.wangchao.javaee.course11_io.other;

import org.junit.Test;

import java.io.*;

/**
 *  其他流的使用
 *  1.标准的输入、输出流
 *  2.打印流
 *  3.数据流
 *
 * @author Wang Chao
 * @create 2023/2/4 14:24
 */
public class OtherStreamTest {

    /**
     * 1.标准的输入、输出流
     *  1.1
     *      System.in: 标准的输入流，默认从键盘输入
     *      System.out:标准的输出流，默认从控制台输出
     *
     *  1.2
     *      System类的setIn(InputStream is) / setOut(PrintStream ps)方式重新指定输入和输出的流。
     *
     *  1.3 练习：
     *      从键盘输入字符串，要求将读取到整行字符串转成大写输出，然后继续进行输入操作，
     *      直至当输入'e'或"exit"，退出程序。
     *
     *      方式一：使用Scanner实现，调用next()返回一个字符串
     *      方式二：使用System.in实现。System.in --> 转换流 --> BufferedReader的readLine()
     */
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            //1.造流
            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);

            //2.操作
            while (true) {
                System.out.println("请输入字符串：");
                String data = br.readLine();
                if ("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)) {
                    System.out.println("程序退出！");
                    break;
                }

                System.out.println(data.toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3.关闭流
            if (br != null) {
                try {
                    br.close();//关闭外层流的同时，内层流也会自动的进行关闭。关于内层流的关闭，我们可以省略.
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 2. 打印流：PrintStream 和PrintWriter
     *
     *     2.1 提供了一系列重载的print() 和 println()
     *     2.2 练习：
     */
    @Test
    public void test2() {
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream(new File("D:\\IO\\text.txt"));
            // 创建打印输出流,设置为自动刷新模式(写入换行符或字节 '\n' 时都会刷新输出缓冲区)
            ps = new PrintStream(fos, true);
            if (ps != null) {// 把标准输出流(控制台输出)改成文件
                System.setOut(ps);
            }


            for (int i = 0; i <= 255; i++) { // 输出ASCII字符
                System.out.print((char) i);
                if (i % 50 == 0) { // 每50个数据一行
                    System.out.println(); // 换行
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
        }

    }

    /**
     * 3. 数据流
     *  3.1 DataInputStream 和 DataOutputStream
     *  3.2 作用：用于读取或写出基本数据类型的变量或字符串
     *
     *  练习：将内存中的字符串、基本数据类型的变量写出到文件中。
     *
     *  注意：处理异常的话，仍然应该使用try-catch-finally.
 */
    @Test
    public void test3() throws IOException {
        //1.
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
        //2.
        dos.writeUTF("刘建辰");
        dos.flush();//刷新操作，将内存中的数据写入文件
        dos.writeInt(23);
        dos.flush();
        dos.writeBoolean(true);
        dos.flush();
        //3.
        dos.close();
    }

    /**
     * 将文件中存储的基本数据类型变量和字符串读取到内存中，保存在变量中。
     *
     * 注意点：读取不同类型的数据的顺序要与当初写入文件时，保存的数据的顺序一致！
     */
    @Test
    public void test4() throws IOException {
        //1.
        DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
        //2.
        String name = dis.readUTF();
        int age = dis.readInt();
        boolean isMale = dis.readBoolean();

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("isMale = " + isMale);

        //3.
        dis.close();

    }
}
