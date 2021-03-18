package com.itheima.myHomework.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 一、需求说明：自定义一个学生类，给出成员变量name和age，
 * 使用Collection集合存储自定义对象并遍历，
 * 遍历集合的时候，在控制台输出学生对象的成员变量值。
 */
public class Test01 {
	
	public static void main(String[] args) {
		//创建集合对象
		Collection<Test01Student> c = new ArrayList<Test01Student>();
		
		//创建元素对象
		Test01Student ts1 = new Test01Student("黎明",65);
		Test01Student ts2= new Test01Student("刘德华",55);	
		Test01Student ts3 = new Test01Student("成龙",66);
		
		//添加对象
		c.add(ts1);
		c.add(ts2);
		c.add(ts3);

		//创建迭代对象
		Iterator<Test01Student> it = c.iterator();
		
		//循环遍历
		while(it.hasNext()){
			Test01Student st = it.next();
			System.out.println(st);
		}
	}

}
