package com.wangchao.javaee.project.developmentteam.domain.equipment.impl;

import com.wangchao.javaee.project.developmentteam.domain.equipment.Equipment;

public class Printer implements Equipment {
    private String model;//表示机器的型号
    private String name;//表示机器的名称

    public Printer(String model, String name) {
        this.model = model;
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getDescription() {
        return model + name;
    }
}
