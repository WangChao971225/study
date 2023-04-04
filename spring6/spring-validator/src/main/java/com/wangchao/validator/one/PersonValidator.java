package com.wangchao.validator.one;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * 方式一：通过Validator接口实现
 *
 * @author Wang Chao
 * @create 2023/2/16 19:50
 */
public class PersonValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "name", "name.empty");
        Person person = (Person) target;
        if (person.getAge() < 0) {
            errors.rejectValue("age", "error value < 0");
        } else if (person.getAge() > 200) {
            errors.rejectValue("age", "error value too old");
        }
    }
}
