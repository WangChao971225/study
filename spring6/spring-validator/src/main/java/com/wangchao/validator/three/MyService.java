package com.wangchao.validator.three;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * @author Wang Chao
 * @create 2023/2/16 20:27
 */
@Service
@Validated
public class MyService {

    public String testMethod(@NotNull @Valid User user) {
        return user.toString();
    }
}
