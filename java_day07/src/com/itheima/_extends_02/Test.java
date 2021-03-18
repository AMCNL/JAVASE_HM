package com.itheima._extends_02;

public class Test {
	public static void main(String[] args) {
		
		//创建对象
		Teacher t = new Teacher();
		
		t.setName("李春男");
		t.setAge(24);
		
		System.out.println(t.getName()+"---"+t.getAge());
		
		System.out.println("------------------------");
		
		//通过构造函数初始化值
		Teacher t2 = new Teacher("lcn",24);
		System.out.println(t2.getName()+"---"+t2.getAge());
		
		
	}

}
