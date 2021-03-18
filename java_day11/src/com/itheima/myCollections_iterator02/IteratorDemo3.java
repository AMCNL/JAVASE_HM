package com.itheima.myCollections_iterator02;

/*
 * 需求:获取一个Collection集合对象,添加元素并遍历
	分析:
	第一步:创建Collection集合对象
	第二步:泛型为String类型
	第三步:添加元素
	第四步:通过迭代器进行遍历
	第五步:打印集合中每一个元素

 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo3 {

	public static void main(String[] args) {
		// 创建集合对象
		Collection<Student> c = new ArrayList<Student>();

		//创建元素对象
		Student s1 = new Student("司马懿", 30);
		Student s2 = new Student("诸葛亮", 35);
		Student s3 = new Student("姜维", 28);

		// 添加对象
		c.add(s1);
		c.add(s2);
		c.add(s3);

		// 创建迭代对象
		Iterator<Student> it = c.iterator();

		while (it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}

	}

}
