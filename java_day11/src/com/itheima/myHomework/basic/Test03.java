package com.itheima.myHomework.basic;
/*
 * 
 * 需求说明：自定义一个学生类，给出成员变量name和age，
 * 使用List集合存储自定义对象并使用增强for进行遍历，
 * 遍历集合的时候，在控制台输出学生对象的成员变量值。
 */
 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test03 {
	public static void main(String[] args) {
		//创建集合对象
		List<Test03Student> list = new ArrayList<Test03Student>();
		
		//创建元素对象
		Test03Student ts1 = new Test03Student("黎明",65);
		Test03Student ts2= new Test03Student("刘德华",55);	
		Test03Student ts3 = new Test03Student("成龙",66);
		
		//添加对象
		list.add(ts1);
		list.add(ts2);
		list.add(ts3);

		
		
		System.out.println("-------增强for遍历-------------");
		for (Test03Student Test03Student : list) {
			System.out.println(Test03Student);
		}
		
	}

}
