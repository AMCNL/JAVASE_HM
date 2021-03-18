package com.itheima.myCollections_iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		
		c.add("hello");
		c.add("world");
		c.add("你好java");
		
		
		//创建遍历对象c.iterator();
		Iterator<String> it = c.iterator();
		
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		//System.out.println(it.next());//java.util.NoSuchElementException

		//为了解决以上异常，我们使用hasNext()方法
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
