package com.wangchao.tx.controller;

import com.wangchao.tx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Wang Chao
 * @create 2023/2/16 18:06
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    public void buyBook(Integer bookId, Integer userId) {
        bookService.buyBook(bookId, userId);
    }
}
