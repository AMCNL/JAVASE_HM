package com.itheima.methodMax;

import java.util.Scanner;

/*
 * 定义一个方法获取三个整数中的较大值
要求：1.在注释中写明需求
          2.在注释中明确返回值类型是什么
          3.在注释中明确参数列表是什么

调用该方法返回结果，打印结果
要求：1.使用键盘录入三个int数做为参数，调用方	     法时传入
	   2.使用int类型接收结果，并打印输出结果
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个值：");
		int x = sc.nextInt();
		
		System.out.println("请输入第二个值：");
		int y = sc.nextInt();
		
		System.out.println("请输入第三个值：");
		int z = sc.nextInt();
		
		int max = getMax(x, y,z);
		System.out.println("max:"+max);
	}
	/*
	 * 返回值类型：int
	 * 参数列表：int a,int b
	 */
	public static int getMax(int a,int b,int c){
		int max=0;
		
		if(a>b){
			max = a;
			
		}else{
			max = b;
		}
		
		if(c>max){
			max = c;
		}
		
		//三元
		int max1=(a>b)?(a>c?a:c):(b>c?b:c);
		
		//return max;
		return max1;
	}

}
