package com.itheima.myBufferedReaderStream03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StudentToBuffered {

	public static void main(String[] args) throws IOException {
		//创建集合对象
		ArrayList<Student> array = new ArrayList<Student>();
		
		//创建学生对象
		Student s1 = new Student("s001","小花",30,"北京");
		Student s2 = new Student("s002","小明",32,"上海");
		Student s3 = new Student("s003","小刘",33,"广州");
		Student s4 = new Student("s004","小郑",35,"深圳");
		
		//添加集合元素
		array.add(s1);
		array.add(s2);
		array.add(s3);
		array.add(s4);
		
		//创建字符缓冲输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("stu.txt"));
		
		
		//遍历集合，并写入数据
		for (Student stu : array) {
			StringBuilder sb = new StringBuilder();
			sb.append(stu.getSid()).append(",").append(stu.getName()).append(",").append(stu.getAge()).append(",").append(stu.getAddr());
			System.out.println(sb.toString());
			
			bw.write(sb.toString());
			
			bw.newLine();
			bw.flush();
		}
		
		//释放资源
		bw.close();
		
		
	}

}
