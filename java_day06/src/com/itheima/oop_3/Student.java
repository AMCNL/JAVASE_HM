package com.itheima.oop_3;

public class Student {
	
	private String name;
	
	private int age;
	
	public void setName(String n){
		name = n;
	}
	
	public String getName(){
		
		return name;
	}
	
	public void setAge(int a){
		if(a<0 || a>200){
			System.out.println("���������������");
		}else{
			age = a;
		}
	}
	
	public int getAge(){
		return age;
	}
	
	

}
