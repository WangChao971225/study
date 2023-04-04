package com.wangchao.javaee.project.developmentteam.domain.employee;

import com.wangchao.javaee.project.developmentteam.domain.equipment.Equipment;

public class Designer extends Programmer {
    private double bonus;//股份

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
