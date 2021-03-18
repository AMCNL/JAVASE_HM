package com.itheima.methodRefactor;

/*
	定义重载的两个方法实现比较两个数据是否相等。
	要求：
	1.第一个方法的参数类型为两个int类型
	2.第二个方法的参数类型为两个double类型
	3.在main方法中进行测试

 */
public class TestReview {
	public static void main(String[] args) {

		//boolean flag1 = compare(10,10);
		boolean flag1 = compare((int) 10, (int) 10);
		System.out.println(flag1);
		
		
		//boolean flag2 = compare(10.1,10.2);
		boolean flag2 = compare((double) 10.1, (double) 10.2);
		System.out.println(flag2);

	}

	// 比较两个int 类型的值是否相等
	public static boolean compare(int a, int b) {
		return a == b;
	}

	// 比较两个double类型的值是否相等
	public static boolean compare(double a, double b) {
		return a == b;
	}

}
