package com.itheima.myHomework.high_test01;

import java.util.ArrayList;

/*
 * 一、分析以下需求，并用代码实现
1.定义ArrayList集合，存入多个字符串"abc" "def"  "efg" "def" "def" "qwe" "def" "def" "swd" "wwe" "def" "def"
2.使用普通for循环获取集合中索引为3的元素并打印
3.定义方法public static boolean myContains(ArrayList list,String str)
			(1)参数
				a.ArrayList list: 表示存储多个String数据的集合
				b.String str: 表示一个字符串
			(2)返回值
				true: 表示list集合中包含字符串str
				false: 表示list集合中不包含字符串str
4.利用上面定义的mycontains方法统计集合中包含字符串"def"的数量
5.删除集合中的所有字符串"def"(思路:循环判断集合中是否包含"def"字符串,包含就删除)
6.将集合中每个元素中的小写字母变成大写字母
 */
public class Test02 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("abc");
		arr.add("def");
		arr.add("efg");
		arr.add("def");
		arr.add("def");
		arr.add("qwe");
		arr.add("def");
		arr.add("swd");
		arr.add("wwe");
		arr.add("def");
		arr.add("def");
		
		
		
		System.out.println(arr.get(3));
	
		
	}
	
	public static boolean myContains(ArrayList list,String str){
		return list.contains(str);
	}
	
	
	
	
	

}
