package com.wangchao.spring5.demo1;

/**
 * 使用有参构造器注入
 */
public class Orders {
    //属性
    private String oname;
    private String oaddress;
    //有参数构造
    public Orders(String oname, String oaddress) {
        this.oname = oname;
        this.oaddress = oaddress;
    }

    public void testOrders() {
        System.out.println(oname + ":" + oaddress);
    }

}
