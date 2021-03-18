package com.itheima.methodSum;
/*
 * 定义一个方法: 求两个整数的和
  要求: 1.注释中描述该方法的作用
	  2.注释中明确该方法的返回值类型
	  3.注释中明确该方法的参数的个数和类型

 */
public class Test01 {

	public static void main(String[] args) {
		
		//定义int类型的变量接收返回结果：
		int result  = sum(10,20);
		
		//输出结果
		System.out.println("result:"+result);

	}
	
	/*
	 * 定义一个方法: 求两个整数的和
	 * 
	 *   明确：
	 *      返回值类型：int
	 *      参数列表：int a,int b
	 */
	public static int sum(int a,int b){
		
		//求和操作
		int c = a + b;
		
		//返回值
		return c;
		
		//return a+b;
	}

}
