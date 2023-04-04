package com.wangchao.tx.service;

/**
 * @author Wang Chao
 * @create 2023/2/16 18:01
 */
public interface BookService {

    //购买数的方法
    void buyBook(Integer bookId, Integer userId);
}
