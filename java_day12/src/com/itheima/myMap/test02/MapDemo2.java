package com.itheima.myMap.test02;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * map集合的遍历2
 * 思路：
 *   通过获取键值对集合获取值
 *   
 *   1-获取所有的键值对集合
 *   2-通过键值对集合的方法获取键和值
 *   
 *   map.entrySet();
 *
 */
public class MapDemo2 {

	public static void main(String[] args) {
		// 创建集合对象
		Map<String, String> map = new HashMap<String, String>();

		map.put("it001", "林青霞");
		map.put("it002", "张曼玉");
		map.put("it003", "王祖贤");

		Set<Entry<String, String>> entrySet = map.entrySet();
		
		for (Entry<String, String> e : entrySet) {
			//获取键
			String key = e.getKey();
			//获取值
			String value = e.getValue();
			
			//输出
			System.out.println(key+"-----"+value);
		}

	}

}
