package com.itheima.myList_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 需求:练习List集合中的功能
	void add(int index,E element):在指定位置添加元素
	E remove(int index):删除指定位置的元素
	E get(int index):获取指定位置的元素
	E set(int index,E element):修改指定位置的元素

 */
public class ListTest2 {

	public static void main(String[] args) {
		// 创建集合对象
		List<String> list = new ArrayList<String>();

		list.add("java");
		list.add("php");
		list.add("ui");

		// List接口特有方法
		list.add(1, "haha");

		System.out.println(list);

		System.out.println("-----------------------");

		// remove()
		System.out.println("remove:" + list.remove(1));
		System.out.println(list);

		System.out.println("-----------------------");

		// set()

		list.set(1, "呵呵");

		System.out.println(list);

		System.out.println("-----------------------");

		// get()

		System.out.println(list.get(1));
		//java.lang.IndexOutOfBoundsException

		
		//java.lang.IndexOutOfBoundsException
		//System.out.println(list.get(15));错误
	}

}
