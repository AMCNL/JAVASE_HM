package com.itheima.myMap.test02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * map集合的遍历
 *    思路：首先得到所有的键集合
 *         遍历所有的键，通过get(key)得到对应的value值
 */
public class MapDemo1 {

	public static void main(String[] args) {
		// 创建集合对象
		Map<String, String> map = new HashMap<String, String>();

		map.put("it001", "林青霞");
		map.put("it002", "张曼玉");
		map.put("it003", "王祖贤");

		// 得到所有键的集合
		Set<String> set = map.keySet();

		for (String key : set) {

			// 根据键得到值
			String value = map.get(key);

			System.out.println(key + "---" + value);

		}

	}

}
