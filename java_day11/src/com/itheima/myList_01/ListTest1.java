package com.itheima.myList_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 需求:创建List集合对象,添加元素并遍历
	分析:
	第一步:获取List集合对象
	第二步:泛型为String
	第三步:添加集合元素
	第四步:使用迭代器对集合进行遍历
	第五步:打印集合元素

 */
public class ListTest1 {

	public static void main(String[] args) {
		// 创建集合对象
		List<String> list = new ArrayList<String> ();
		
		list.add("java");
		list.add("php");
		list.add("ui");
		
		//创建迭代器对象
	    Iterator<String> it = list.iterator();
		
	    //循环遍历
	    while(it.hasNext()){
	    	
	    	String s = it.next();
	    	
	    	System.out.println(s);
	    	
	    }

	}

}
