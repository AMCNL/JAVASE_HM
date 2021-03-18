package com.itheima.myObject;
/*
 * Object类是java所有类的根类，所有的类都直接或者间接继承了该类
 * 构造方法：只有一个无参的Object(){}
 * 
 * 
 * 
 */
public class ObjectDemo {

	public static void main(String[] args) {
		Student st = new Student();
		
		st.setName("licn");
		st.setAge(24);
		
		//System.out.println(st);//重写toString方法前：com.itheima.myObject.Student@633e5e
		
		System.out.println(st);//重写toString方法后 ：Student [name=licn, age=24]

	}

}
