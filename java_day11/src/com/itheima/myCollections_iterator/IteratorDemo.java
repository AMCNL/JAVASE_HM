package com.itheima.myCollections_iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		
		c.add("hello");
		c.add("world");
		c.add("���java");
		
		
		//������������c.iterator();
		Iterator<String> it = c.iterator();
		
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		//System.out.println(it.next());//java.util.NoSuchElementException

		//Ϊ�˽�������쳣������ʹ��hasNext()����
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
