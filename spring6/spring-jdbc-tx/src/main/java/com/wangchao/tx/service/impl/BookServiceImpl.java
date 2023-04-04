package com.wangchao.tx.service.impl;

import com.wangchao.tx.dao.BookDao;
import com.wangchao.tx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Wang Chao
 * @create 2023/2/16 18:02
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    @Transactional
    public void buyBook(Integer bookId, Integer userId) {
        //根据图书id查询图书的价格
        Integer price = bookDao.getBookPriceByBookId(bookId);

        //更新图书表库存量 -1
        bookDao.updateStock(bookId);

        //更新用户表用户余额 - 图书价格
        bookDao.updateUserBalance(userId, price);

        //int a = 1/0;
    }
}
