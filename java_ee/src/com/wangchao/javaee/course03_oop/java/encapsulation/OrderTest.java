package com.wangchao.javaee.course03_oop.java.encapsulation;

public class OrderTest {
	
	private int orderPrivate;
	int orderDefault;
	public int orderPublic;
	
	
	private void methodPrivate(){
		orderPrivate = 1;
		orderDefault = 2;
		orderPublic = 3;
	}
	void methodDefault(){
		orderPrivate = 1;
		orderDefault = 2;
		orderPublic = 3;
	}
	public void methodPublic(){
		orderPrivate = 1;
		orderDefault = 2;
		orderPublic = 3;
	}
	
}
