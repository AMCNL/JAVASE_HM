package com.itheima.myCollections_iterator_review;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		// �������϶���
		Collection<String> c = new ArrayList<String>();
		
		c.add("hello");
		c.add("world");
		c.add("java");
		c.add("��ó���");
		
		//������������
		Iterator it = c.iterator();
		
		//
		
		while(it.hasNext()){
			
			System.out.println(it.next());
		}

	}

}
