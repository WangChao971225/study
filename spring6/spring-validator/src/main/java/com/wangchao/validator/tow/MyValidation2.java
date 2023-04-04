package com.wangchao.validator.tow;

import org.springframework.validation.BindException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;

import java.util.List;

/**
 * @author Wang Chao
 * @create 2023/2/16 20:20
 */
@Service
public class MyValidation2 {

    @Autowired
    private Validator validator;

    public boolean validatorByUserTwo(User user) {
        BindException bindException = new BindException(user, user.getName());
        validator.validate(user,bindException);
        List<ObjectError> allErrors = bindException.getAllErrors();
        System.out.println(allErrors);
        return bindException.hasErrors();
    }
}
