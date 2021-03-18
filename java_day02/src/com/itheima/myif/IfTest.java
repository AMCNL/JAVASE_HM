package com.itheima.myif;

import java.util.Scanner;

/*
 * 键盘录入学生考试成绩，根据成绩判断该学生属于哪个级别
     90-100【包含90和100】      优秀
     80-90【包含80不包含90】    好
     70-80 【包含70不包含80】   良
     60-70 【包含60不包含70】   及格
     60分以下 【不包含60】       不及格

 */
public class IfTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//提示
		System.out.print("请输入成绩：");
		int score = sc.nextInt();
		
		if(score>100 || score<0){
			System.out.println("您输入的成绩不合法！");
		}else if(score>=90 && score<=100){
			System.out.println("优秀");
		}else if(score>=80 && score<90){
			System.out.println("好");
		}else if(score>=70 && score<80){
			System.out.println("良好");
		}else if(score>=60 && score<70){
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}

	}

}
