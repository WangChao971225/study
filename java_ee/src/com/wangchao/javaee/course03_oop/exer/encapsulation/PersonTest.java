package com.wangchao.javaee.course03_oop.exer.encapsulation;

/*
    在PersonTest类中实例化Person类的对象，
    调用setAge()和getAge()方法,体会Java的封装性。
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();

        person.setAge(130);

        System.out.println(person.getAge());
    }
}
