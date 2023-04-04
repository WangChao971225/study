package com.wangchao.boot.bean;

import lombok.Data;
import lombok.ToString;

import java.util.*;

/**
 * @author Wang Chao
 * @create 2023/2/28 22:21
 */
@Data
@ToString
public class Person {

    private String userName;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private Pet pet;
    private String [] interests;
    private List<String> animal;
    private Map<String, Object> score;
    private Set<Double> salarys;
    private Map<String, List<Pet>> allPets;

}
