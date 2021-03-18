package com.itheima.myHomework.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		//创建集合对象
		List<Test02Student> list = new ArrayList<Test02Student>();
		
		//创建元素对象
		Test02Student ts1 = new Test02Student("黎明",65);
		Test02Student ts2= new Test02Student("刘德华",55);	
		Test02Student ts3 = new Test02Student("成龙",66);
		
		//添加对象
		list.add(ts1);
		list.add(ts2);
		list.add(ts3);

		System.out.println("-------迭代遍历-------------");
		//创建迭代对象
		Iterator<Test02Student> it = list.iterator();
		
		//循环遍历
		while(it.hasNext()){
			Test02Student st = it.next();
			System.out.println(st);
		}
		
		System.out.println("-------普通for遍历-------------");
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println(list.get(i));
		}
		
		System.out.println("-------增强for遍历-------------");
		for (Test02Student Test02Student : list) {
			System.out.println(Test02Student);
		}
		
	}

}
