package com.itheima.myMap.myTest01_review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 *hashMap中嵌套ArrayList
 */
public class MapDemo2 {

	public static void main(String[] args) {
		// 创建集合对象
		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

		// 创建元素对象
		ArrayList<String> sgyy = new ArrayList<String>();

		sgyy.add("周瑜");
		sgyy.add("曹操");

		ArrayList<String> xyj = new ArrayList<String>();

		xyj.add("唐僧");
		xyj.add("八戒");

		ArrayList<String> shz = new ArrayList<String>();

		shz.add("宋江");
		shz.add("李逵");

		hm.put("三国演义", sgyy);
		hm.put("西游记", xyj);
		hm.put("水浒传", shz);

		// 通过键获得值
		Set<String> keySet = hm.keySet();
		for (String key : keySet) {
			System.out.println(key);

			ArrayList<String> alist = hm.get(key);
			for (String string : alist) {
				System.out.println("\t" + string);
			}
		}

		System.out.println("-----------------------------------");

		// 通过键值对对象
		Set<Entry<String, ArrayList<String>>> entrySet = hm.entrySet();

		for (Entry<String, ArrayList<String>> entry : entrySet) {
			String key = entry.getKey();
			System.out.println(key);
			ArrayList<String> alist = entry.getValue();

			for (String string : alist) {
				System.out.println("\t" + string);
			}

		}
	}

}
