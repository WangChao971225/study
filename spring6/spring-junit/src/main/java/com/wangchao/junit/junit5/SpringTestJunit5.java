package com.wangchao.junit.junit5;

import com.wangchao.junit.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author Wang Chao
 * @create 2023/2/14 18:29
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class SpringTestJunit5 {

    @Autowired
    private User user;

    @Test
    public void testUser() {
        System.out.println(user);
        user.run();
    }
}
