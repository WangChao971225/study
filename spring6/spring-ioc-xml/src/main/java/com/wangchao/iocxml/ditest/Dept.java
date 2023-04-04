package com.wangchao.iocxml.ditest;

import java.util.List;

/**
 * 部门类
 *
 * @author Wang Chao
 * @create 2023/2/8 20:35
 */
public class Dept {

    //部门名称
    private String dname;
    //一个部门有很多的员工
    private List<Emp> empList;

    public void info() {
        System.out.println("部门名称:" + this.dname);
    }

    public void showEmpList() {
        System.out.println("部门名称:" + this.dname);
        for (Emp emp: empList) {
            System.out.println(emp.getEname());
        }
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }
}
