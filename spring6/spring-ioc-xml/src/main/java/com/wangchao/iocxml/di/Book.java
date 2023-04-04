package com.wangchao.iocxml.di;

/**
 * @author Wang Chao
 * @create 2023/2/8 19:58
 */
public class Book {

    private String bname;
    private String author;
    private Integer prices;

    //提供构造器
    public Book() {
    }

    public Book(String bname, String author) {
        this.bname = bname;
        this.author = author;
    }

    //生成set方法
    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPrices() {
        return prices;
    }

    public void setPrices(Integer prices) {
        this.prices = prices;
    }

    //toString()方法

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", prices=" + prices +
                '}';
    }

    public static void main(String[] args) {
        //set方法注入
        Book book = new Book();
        book.setBname("java");
        book.setAuthor("尚硅谷");

        //通过构造器注入
        new Book("cpp", "尚硅谷");
    }
}
