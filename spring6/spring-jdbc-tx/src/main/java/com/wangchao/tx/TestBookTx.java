package com.wangchao.tx;

import com.wangchao.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author Wang Chao
 * @create 2023/2/16 18:08
 */
@SpringJUnitConfig(locations = "classpath:beans.xml")
public class TestBookTx {

    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook() {
        bookController.buyBook(1, 1);
    }
}
