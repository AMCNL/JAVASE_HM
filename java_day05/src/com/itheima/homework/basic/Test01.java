package com.itheima.homework.basic;
/*
	 定义一个方法 能接受一个整数(这个整数大于3)打印0到这个整数(包含)之间的所有的偶数
	如 接受的数字是6则调用完方法打印出来的偶数是 0 2 4 6
	如 接受的数字是 5则调用完方法打印出来的偶数是 0 2 4
 */
public class Test01 {

	public static void main(String[] args) {
		//调用方法传递参数
		//printOdd(5);
		
		printOdd(6);

	}
	/*
	 * 返回值类型：void
	 * 参数列表：int n
	 */
	public static void printOdd(int n){
		for(int i=0;i<=n;i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
	}

}
