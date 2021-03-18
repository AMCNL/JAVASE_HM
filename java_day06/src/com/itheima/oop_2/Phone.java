package com.itheima.oop_2;

public class Phone {
	String brand; //手机品牌
	
	int price;   //价格
	
	String color;  //颜色
	
	//成员方法
	public void call(String brand){
		System.out.println("给"+brand+"打电话！");
	}
	
	public void sendMessage(String brand){
		System.out.println("给"+brand+"发讯息");
	}

}
