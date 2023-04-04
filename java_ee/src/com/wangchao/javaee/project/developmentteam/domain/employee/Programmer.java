package com.wangchao.javaee.project.developmentteam.domain.employee;

import com.wangchao.javaee.project.developmentteam.domain.equipment.Equipment;
import com.wangchao.javaee.project.developmentteam.service.Status;

public class Programmer extends Employee {
    private int memberId;//员工号
    private Status status;//员工状态
    private Equipment equipment;//领用设备

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }
}
