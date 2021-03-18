package com.itheima.myHomework.high_test01;

public class TestStudentTool {

	public static void main(String[] args) {
		//定义数组数组
		Student[] s = new Student[5];
		
		s[0] = new StudentTool("小明",20,98);
		s[1] = new StudentTool("小花",25,99);
		s[2] = new StudentTool("李翔",20,97);
		s[3] = new StudentTool("姚明",25,100);
		s[4] = new StudentTool("本山",20,55);
		
		StudentTool st = new StudentTool();
		
		int avg = st.getAverageScore(s);
		
		System.out.println("平均分为："+avg);
		
		int max = st.getMaxScore(s);
		System.out.println("最高分数为："+max);
		
		int count = st.getCount(s);
		System.out.println("不及格的人数有："+count+"个");
		
		Student maxs = st.getMaxStudent(s);
		System.out.println("成绩最高学员的姓名是："+maxs.getName());
		
		
		s[1].eat();
		s[2].eat();
		
		s[3].study("java");
		
		
		

	}

}
