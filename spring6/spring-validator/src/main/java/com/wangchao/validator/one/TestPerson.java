package com.wangchao.validator.one;

import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

/**
 * @author Wang Chao
 * @create 2023/2/16 19:55
 */
public class TestPerson {

    public static void main(String[] args) {
        //创建person对象
        Person person = new Person();
        person.setName("张三");
        person.setAge(201);

        //创建Person对应的DataBinder
        DataBinder binder = new DataBinder(person);

        //设置校验
        binder.setValidator(new PersonValidator());

        //由于Person对象中的属性为空，所以校验不能通过
        binder.validate();

        //输出结果
        BindingResult res = binder.getBindingResult();
        System.out.println(res.getAllErrors());
    }
}
