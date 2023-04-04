package com.wangchao.tx.dao;

/**
 * @author Wang Chao
 * @create 2023/2/16 17:50
 */
public interface BookDao {

    //根据图书id查询图书价格
    Integer getBookPriceByBookId(Integer bookId);

    //更新图书表库存-1
    void updateStock(Integer bookId);

    //更新用户表用户余额 - 图书价格
    void updateUserBalance(Integer userId, Integer price);
}
