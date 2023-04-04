package com.wangchao.javaee.project.customer.service;

import com.wangchao.javaee.project.customer.bean.Customer;

/**
 * @Description CustomerList为Customer对象的管理模块，
 * 内部使用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历的方法，
 * 供CustomerView调用
 */
public class CustomerList {
    //保存客户对象的数组
    private Customer[] customers;
    //记录已经保存客户对象的数量
    private int total = 0;

    /**
     * @Description 用来初始化customer数组的构造器
     * @param totalCustomer 指定数组的长度
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * @Description 将指定的客户添加到数组中
     * @param customer 客户信息
     * @return true：添加成功；false：添加失败。
     */
    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            return false;
        }

        customers[total++] = customer;
        return true;
    }

    /**
     * @Description 修改指定索引位置的客户信息
     * @param index
     * @param customer
     * @return true：修改成功；false：修改失败。
     */
    public boolean replaceCustomer(int index, Customer customer) {
        if (index <= 0 || index > total) {
            return false;
        }

        customers[index - 1] = customer;
        return true;
    }

    /**
     * @Description 删除指定索引位置的客户信息
     * @param index
     * @return true：删除成功；false：删除失败。
     */
    public boolean deleteCustomer(int index) {
        if (index <= 0 || index > total) {
            return false;
        }

        for (int i = index; i < total; i++) {
            customers[i - 1] = customers[i];
        }
        customers[--total] = null;
        return true;
    }

    /**
     * @Description 获取所有的用户信息
     * @return 用户信息集
     */
    public Customer[] getAllCustomers() {
        Customer[] customers = new Customer[total];
        for (int i = 0; i < total; i++) {
            customers[i] = this.customers[i];
        }
        return customers;
    }

    /**
     * @Description 获取指定索引位置上的客户
     * @param index 指定索引
     * @return 返回客户信息，找不到则返回null
     */
    public Customer getCustomer(int index) {
        if (index <= 0 || index > total) {
            return null;
        }
        return customers[index - 1];
    }

    /**
     * @Description 获取存储的客户数量
     * @return 客户数量
     */
    public int getTotal() {
        return this.total;
    }
}
