package com.itheima.myHomework.basic;
/*
 * 
 * 需求说明：自定义一个学生类，给出成员变量name和age，
 * 使用List集合存储自定义对象并使用增强for进行遍历，
 * 遍历集合的时候，在控制台输出学生对象的成员变量值。
 */
 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test04 {
	public static void main(String[] args) {
		//创建集合对象
				List<Test04Student> list = new ArrayList<Test04Student>();
				
				//创建元素对象
				Test04Student ts1 = new Test04Student("黎明",65);
				Test04Student ts2= new Test04Student("刘德华",55);	
				Test04Student ts3 = new Test04Student("成龙",66);
				
				//添加对象
				list.add(ts1);
				list.add(ts2);
				list.add(ts3);

				System.out.println("-------迭代遍历-------------");
				//创建迭代对象
				Iterator<Test04Student> it = list.iterator();
				
				//循环遍历
				while(it.hasNext()){
					Test04Student st = it.next();
					System.out.println(st);
				}
				
				System.out.println("-------普通for遍历-------------");
				for (int i = 0; i < list.size(); i++) {
					
					System.out.println(list.get(i));
				}
				
				System.out.println("-------增强for遍历-------------");
				for (Test04Student Test04Student : list) {
					System.out.println(Test04Student);
				}
		
	}

}
