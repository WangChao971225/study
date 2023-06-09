package com.wangchao.javaee.course04_exception;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 一、异常的处理：抓抛模型
 *
 * 过程一：“抛”：程序在正常执行的过程中，一旦出现异常，就会在异常代码出生成一个对应异常类的对象。
 *             并将此对象抛出。
 *             一但抛出对象以后，其后的代码就不再执行。
 *
 *        关于异常对象的产生：
 *             ① 系统自定生成的异常对象
 *             ② 手动生成一个异常对象，并抛出(throw)
 *
 * 过程二：“抓”：可以理解为异常的处理方式：
 *             ① try-catch-finally
 *             ② throws
 *
 * 二、 try-catch-finally的使用
 *
 *  try {
 *      //可能出现异常的代码
 *  } catch (异常类型1 变量名1) {
 *      //处理异常的方式1
 *  } catch (异常类型2 变量名2) {
 *      //处理异常的方式2
 *  } catch (异常类型3 变量名3) {
 *      //处理异常的方式3
 *  }
 *  ......
 *  finally {
 *      //一定会执行的代码
 *  }
 *
 *  说明：
 *  1. finally是可选的。
 *  2. 使用try将可能会出现异常代码包装起来，在执行过程中，一旦出现异常，就会生成一个对应异常类的对象，根据此对象
 *     的类型，去catch中进行匹配
 *  3. 一旦try中的异常对象匹配到某一个catch时，就会进入catch中进行异常的处理。一旦处理完成，就跳出当前的
 *     try-catch结构(在没有写finally的情况)。继续执行后面的代码
 *  4. catch中的异常类型如果没有子父类关系，则与声明的先后顺序无关
 *     catch中的异常类型如果满足子父类关系，则要求异常子类一定要声明在父类异常的上面。否则报错
 *  5. 常用的异常对象处理的方式：
 *          ① String getMessage()
 *          ② printStackTrace()
 *  6. 在try结构以后，就不能再被调用
 *  7. try-catch-finally结构可以嵌套
 *
 *  体会1：使用try-catch-finally处理编译时异常，是得程序编译时就不再报错，但是运行时仍可能报错。
 *        相当于我么能使用try-catch-finally将一个编译时可能出现的异常，延迟到运行时出现。
 *
 *  体会2：开发中，由于运行时异常比较常见，所以我们通常就不针对运行时一巡航编写try-catch-finally了。
 *        针对编译时异常，我们说一般要考虑异常的处理。
 */
public class TryCatchTest {

    @Test
    public void test1() {
        String str = "123";
        str = "abc";
        int num = 0;
        try {
            num = Integer.parseInt(str);

            System.out.println("hello~~~~1");
        } catch (NumberFormatException e) {
            System.out.println("出现数值转换异常了，不要着急....");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("出现空指针异常了，不要着急....");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("出现异常了，不要着急....");
            e.printStackTrace();
        }

        System.out.println(num);

        System.out.println("hello-----2");

    }

    @Test
    public void test2(){
        try{
            File file = new File("hello.txt");
            FileInputStream fis = new FileInputStream(file);

            int data = fis.read();
            while(data != -1){
                System.out.print((char)data);
                data = fis.read();
            }

            fis.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
