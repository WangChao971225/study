package com.wangchao.javaee.project.developmentteam.domain.equipment.impl;

import com.wangchao.javaee.project.developmentteam.domain.equipment.Equipment;

public class NoteBook implements Equipment {
    private String model;//表示机器的型号
    private double price;//价格

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + price;
    }
}
