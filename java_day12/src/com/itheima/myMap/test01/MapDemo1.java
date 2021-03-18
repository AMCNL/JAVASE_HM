package com.itheima.myMap.test01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {
		// 创建集合对象
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("it001", "林青霞");
		map.put("it002", "张曼玉");
		map.put("it003", "王祖贤");
		
		//输出集合对象
		System.out.println(map);//重写了toString方法
		
		
		

	}

}
