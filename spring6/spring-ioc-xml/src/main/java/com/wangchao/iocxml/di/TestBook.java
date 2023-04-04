package com.wangchao.iocxml.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wang Chao
 * @create 2023/2/8 20:04
 */
public class TestBook {

    //setter注入
    @Test
    public void testSetter() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");

        Book book = (Book) context.getBean("book", Book.class);

        System.out.println(book);
    }

    //构造器注入
    @Test
    public void testConstructor() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");

        Book book = (Book) context.getBean("bookCon", Book.class);

        System.out.println(book);
    }

    //特殊值：NULL值
    @Test
    public void testNull() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");

        Book book = (Book) context.getBean("bookNull", Book.class);

        System.out.println(book);
    }

    //特殊值：XML实体(符号、标签)
    // 如 '<' : &lt;   '>' : &gt;
    @Test
    public void testXmlSymbol() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");

        Book book = (Book) context.getBean("bookXmlSymbol", Book.class);

        System.out.println(book);
    }

    //特殊值：CDATA节
    // 通过 <![CDATA[<Mybatis>]]> 可以标识特殊符号
    @Test
    public void testCDATA() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");

        Book book = (Book) context.getBean("bookCDATA", Book.class);

        System.out.println(book);
    }
}
