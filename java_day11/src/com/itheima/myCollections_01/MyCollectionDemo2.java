package com.itheima.myCollections_01;

import java.util.ArrayList;
import java.util.Collection;

public class MyCollectionDemo2 {

	public static void main(String[] args) {
	    //ArrayList
		Collection<String> c = new ArrayList<String>();
		
		//add()添加方法
		c.add("hello");
		c.add("world");
		c.add("你好世界！");
		
		System.out.println(c.remove("world"));
		
		//c.clear();//清空集合
		
		
		//c.contains()是否包含某元素
		System.out.println(c.contains("hello"));
		
		//c.size()集合的长度
		
		System.out.println(c);//重写了toString方法

	}

}
