package com.itheima.myCollections_iterator_review;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		// 创建集合对象
		Collection<String> c = new ArrayList<String>();
		
		c.add("hello");
		c.add("world");
		c.add("java");
		c.add("你好畅哥");
		
		//创建遍历对象
		Iterator it = c.iterator();
		
		//
		
		while(it.hasNext()){
			
			System.out.println(it.next());
		}

	}

}
