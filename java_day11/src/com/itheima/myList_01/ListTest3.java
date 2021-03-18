package com.itheima.myList_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 需求：List集合的普通for循环
	分析：
	第一步:获取一个List集合
	第二步:泛型是String
	第三步:使用List中的get和size方法对集合进行变量
	第四步:打印集合元素
 */
public class ListTest3 {

	public static void main(String[] args) {
		// 创建集合对象
		List<String> list = new ArrayList<String>();

		list.add("java");
		list.add("php");
		list.add("ui");

		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		
		
		System.out.println("---------------------------------");
	
		
		//使用迭代器进行遍历
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//
	}

}
