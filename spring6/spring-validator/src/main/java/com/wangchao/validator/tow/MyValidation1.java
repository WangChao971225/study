package com.wangchao.validator.tow;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Wang Chao
 * @create 2023/2/16 20:14
 */
@Service
public class MyValidation1 {

    @Autowired
    private Validator validator;

    public boolean validatorByUserOne(User user) {
        Set<ConstraintViolation<User>> validate = validator.validate(user);
        System.out.println(validate);
        return validate.isEmpty();
    }
}
