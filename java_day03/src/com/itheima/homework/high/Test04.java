package com.itheima.homework.high;

import java.util.Scanner;

/*
 * 循环录入某学生的5门课程的成绩并计算平均分。
 * 如果某分数录入为负，则停止录入并提示录入错误。
 * 
 * 思路：
 *  1.创建键盘录入对象
	2.定义int类型的变量sum(总分)和avg(平均分)，
	     两个变量的初始值位0,String类型的变量name，表示学员姓名
	3.定义boolean类型的变量flag(表示该学生的5门成绩是否正确录入，
	     如果有一个为负值，则负值为true，表示录入错误)，初始值为false
	4.利用for循环，录入5个成绩
		(1)判断当前的成绩如果小于0，flag赋值为true，终止for循环
		(2)否则，如果当前录入的成绩>=0,累加求和
	5.打印结果
		(1)如果flag为true，打印录入错误
		(2)否则如果flag为false，打印总分和平均分
 */
public class Test04 {
	public static void main(String[] args) {
		//定义int类型的变量sum(总分)和avg(平均分)
		int sum = 0;
		int vag = 0;
		
		//学生姓名
		String name;
		
		//定义标记变量
		boolean flag = false;
		
		//定义键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//FOR循环录入数据
		
		
		for(int i=1; i<=5;i++){
			System.out.println("请输入第"+i+"门课程的成绩：");
			int score = sc.nextInt();
			if(score<0){
				flag = true;
				break;
			}
			//求和
			sum +=score;
		}
		
		if(flag){
			System.out.println("您输入的信息有误！");
			
		}else{
			//打印求和
			System.out.println("sum:"+sum);
			
			//求平均数
			vag = sum/5;
			//打印平均数
			System.out.println("vag:"+vag);
		}
		
	}

}
