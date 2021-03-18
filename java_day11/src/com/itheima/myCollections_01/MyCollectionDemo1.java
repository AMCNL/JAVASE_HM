package com.itheima.myCollections_01;

import java.util.ArrayList;
import java.util.Collection;

public class MyCollectionDemo1 {

	public static void main(String[] args) {
	    //ArrayList
		Collection<String> c = new ArrayList<String>();
		
		//add()添加方法
		c.add("hello");
		c.add("world");
		c.add("你好世界！");
		
		System.out.println(c);//重写了toString方法

	}

}
