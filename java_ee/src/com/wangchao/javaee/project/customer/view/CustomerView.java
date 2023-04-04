package com.wangchao.javaee.project.customer.view;

import com.wangchao.javaee.project.customer.bean.Customer;
import com.wangchao.javaee.project.customer.service.CustomerList;
import com.wangchao.javaee.project.customer.utils.CMUtility;

/**
 * @Description CustomerView为主模板，负责菜单的显示和处理用户操作
 */
public class CustomerView {
    //创建一个可以存放十个用户的List对象
    private CustomerList customerList = new CustomerList(10);

    /**
     * 显示《客户信息管理软甲》界面的方法
     */
    public void enterMainMenu() {
        boolean isFlag = true;

        while (isFlag) {
            //界面
            System.out.println("\n-----------------客户信息管理软件-----------------\n");
            System.out.println("                   1 添加客户");
            System.out.println("                   2 修改客户");
            System.out.println("                   3 删除客户");
            System.out.println("                   4 客户列表");
            System.out.println("                   5 退   出\n");
            System.out.print("                   请选择(1-5)：");

            char menu = CMUtility.readMenuSelection();

            switch(menu) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomer();
                    break;
                case '5':
                    System.out.print("确认是否退出(Y/N):");
                    if (CMUtility.readConfirmSelection() == 'Y') {
                        isFlag = false;//退出循环
                    }
            }
        }

    }

    /**
     * 添加客户信息操作
     */
    public void addNewCustomer() {
        System.out.println("----------------------------添加客户----------------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(10);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(13);
        System.out.print("邮箱：");
        String email = CMUtility.readString(13);

        //将上述数据封装到客户对象中
        boolean isSuccess = customerList.addCustomer(new Customer(name, gender, age, phone, email));

        if (isSuccess) {
            System.out.println("----------------------------添加完成----------------------------");
        } else {
            System.out.println("----------------------客户目录已满，添加失败-----------------------");
        }

    }
    /**
     * 修改客户信息操作
     */
    public void modifyCustomer() {
        Customer customer;
        int index;
        System.out.println("----------------------------修改客户----------------------------");
        while(true) {
            System.out.println("请选择待修改客户编号(-1退出)：");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }

            customer = customerList.getCustomer(index);
            if (customer == null) {
                System.out.println("无法找到指定客户！");
            } else {
                //找到相应的客户
                break;
            }
        }


        System.out.print("姓名(" + customer.getName() + ")：");
        String name = CMUtility.readString(10, customer.getName());
        System.out.print("性别(" + customer.getGender() + ")：");
        char gender = CMUtility.readChar(customer.getGender());
        System.out.print("年龄(" + customer.getAge() + ")：");
        int age = CMUtility.readInt(customer.getAge());
        System.out.print("电话(" + customer.getPhone() + ")：");
        String phone = CMUtility.readString(13, customer.getPhone());
        System.out.print("邮箱(" + customer.getEmail() + ")：");
        String email = CMUtility.readString(13, customer.getEmail());

        //将上述数据封装到客户对象中
        boolean isSuccess = customerList.replaceCustomer(index, new Customer(name, gender, age, phone, email));

        if (isSuccess) {
            System.out.println("----------------------------修改完成----------------------------");
        } else {
            System.out.println("----------------------------修改失败----------------------------");
        }
    }

    /**
     * 删除客户信息操作
     */
    public void deleteCustomer() {
        Customer customer;
        int index;
        System.out.println("----------------------------删除客户----------------------------");

        while(true) {
            System.out.println("请选择待删除客户编号(-1退出)：");
            index = CMUtility.readInt();

            if (index == -1) {
                return;
            }

            customer = customerList.getCustomer(index);
            if (customer == null) {
                System.out.println("无法找到指定客户！");
            } else {
                break;
            }
        }

        boolean isSuccess = customerList.deleteCustomer(index);

        if (isSuccess) {
            System.out.println("----------------------------删除完成----------------------------");
        } else {
            System.out.println("----------------------------删除失败----------------------------");
        }
    }

    /**
     * 显示所有客户信息
     */
    public void listAllCustomer() {
        System.out.println("----------------------------客户列表----------------------------");

        int total = customerList.getTotal();
        if (total == 0) {
            System.out.println("没有客户记录！");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");

            Customer[] allCustomers = customerList.getAllCustomers();
            for (int i = 0; i < total; i++) {
                System.out.println((i + 1) + "\t" + allCustomers[i].getName() + "\t" + allCustomers[i].getGender()
                        + "\t" + allCustomers[i].getAge()+ "\t" + allCustomers[i].getPhone() + "\t" + allCustomers[i].getEmail());
            }
        }

        System.out.println("----------------------------客户列表----------------------------");
    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }
}
