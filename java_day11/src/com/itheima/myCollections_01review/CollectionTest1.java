package com.itheima.myCollections_01review;

import java.util.ArrayList;
import java.util.Collection;

/*
	需求:获取Collection集合,并添加元素
	分析:
	第一步:获取Collection集合对象,并确定泛型 
	第二步:添加元素
	第三步:打印集合对象

 */
public class CollectionTest1 {

	public static void main(String[] args) {
		// 创建集合对象（子类接口（List）的实现类（ArrayList））
		Collection<String> c = new ArrayList<String>();
		
		//添加元素
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//打印输出
		System.out.println(c);
		

	}

}
