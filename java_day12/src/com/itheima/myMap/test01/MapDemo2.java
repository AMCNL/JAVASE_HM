package com.itheima.myMap.test01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		// 创建集合对象
		Map<String,String> map = new HashMap<String,String>();
		
		//put方法
		System.out.println(map.put("刘德华", "成龙"));
		System.out.println(map.put("张无忌", "周芷若"));
		System.out.println(map.put("张无忌", "赵敏"));
		
		//remove方法，返回的的是键后面对应的值
		//System.out.println("remove:"+map.remove("刘德华"));

		map.put("it001", "林青霞");
		map.put("it002", "张曼玉");
		map.put("it003", "王祖贤");
		
		//clear()清空集合
		//map.clear();
		
		//判断集合是否为空
		//System.out.println(map.isEmpty());
		
		//判断集合是否含有某元素
		System.out.println(map.containsKey("刘德华"));//true
		System.out.println(map.containsKey("呵呵"));//false
		
		//判断集合是否包含指定对的值
		System.out.println(map.containsValue("成龙"));//true
		System.out.println(map.containsValue("哈哈"));//false
		
		
		//键值对的个数
		System.out.println(map.size());
		
		//输出集合对象
		System.out.println(map);//重写了toString方法
		
		
		

	}

}
