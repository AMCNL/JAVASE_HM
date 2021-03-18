package com.itheima.homework.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 一、需求说明：ArrayList集合嵌套HashMap集合并遍历。
		定义一个ArrayList集合，它包含三个元素，每一个元素都是HashMap类型的。
		每一个HashMap集合的键和值都是String类型的，
		键：String		丈夫的姓名
		值：String		妻子的姓名
		给出如下的字符串数据，请用代码实现需求。
		第一个HashMap集合的元素：
		孙策		大乔
		周瑜		小乔
		第二个HashMap集合的元素：
		郭靖		黄蓉
		杨过		小龙女
		第三个HashMap集合的元素：
		令狐冲	任盈盈
		林平之	岳灵珊
 */
public class Test04 {

	public static void main(String[] args) {
		// 定义集合对象
		ArrayList<HashMap<String, String>> array = new ArrayList<HashMap<String, String>>();

		// 创建元素对象
		HashMap<String, String> hs1 = new HashMap<String, String>();

		hs1.put("孙策", "大乔");
		hs1.put("周瑜", "小乔");

		HashMap<String, String> hs2 = new HashMap<String, String>();

		hs2.put("郭靖", "黄蓉");
		hs2.put("杨过", "小龙女");

		HashMap<String, String> hs3 = new HashMap<String, String>();

		hs3.put("令狐冲", "任盈盈");
		hs3.put("林平之", "岳灵珊");
		
		
		array.add(hs1);
		array.add(hs2);
		array.add(hs3);
		
		//通过键获得值得方式
		for(HashMap<String, String> hs : array){
			
			Set<String> keySet = hs.keySet();
			
			for(String key : keySet){
			   String str = hs.get(key);
			   System.out.println(key+"==="+str);
			}
		}
		System.out.println("----------------------------");
		//通过键值对
		
		for (HashMap<String, String> hashMap : array) {
			Set<Entry<String, String>> entrySet = hashMap.entrySet();
			
			for (Entry<String, String> entry : entrySet) {
				String str1 = entry.getKey();
				
				String str2 = entry.getValue();
				
				System.out.println(str1+"==="+str2);
			}
		}

	}

}
