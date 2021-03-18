package com.itheima.oop_2;

public class PhoneTest {
	public static void main(String[] args) {
		
		//创建对象
		Phone phone = new Phone();
		
		System.out.println(phone.brand);
		System.out.println(phone.price);
		System.out.println(phone.color);
		System.out.println("---------------");

		phone.brand="MI6";
		phone.price = 2999;
		phone.color = "BALCK";
		
		System.out.println(phone.brand);
		System.out.println(phone.price);
		System.out.println(phone.color);
		
		phone.call("lynn");
		phone.sendMessage("lynn");
		System.out.println("---------------");
		
				
	}

}

