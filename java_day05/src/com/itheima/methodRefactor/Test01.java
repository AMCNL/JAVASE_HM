package com.itheima.methodRefactor;
/*
	定义重载的两个方法实现比较两个数据是否相等。
	要求：
	1.第一个方法的参数类型为两个int类型
	2.第二个方法的参数类型为两个double类型
	3.在main方法中进行测试

 */
public class Test01 {
	public static void main(String[] args) {
		//调用方法，传入两个int类型的值
		//boolean b1 = compare(10,10);
		boolean b1 = compare((int)10,(int)10);
		
		System.out.println(b1);
		
		//调用方法，传入两个double类型的值
		
		boolean b2=compare((double)10.1,(double)10.1);
		System.out.println(b2);
	}
	
	//比较int类型的两个值是否相等
	public static boolean compare(int a,int b){
		return a == b;
	}
	
	//比较double类型的两个值是否相等
	public static boolean compare(double a,double b){
		return a == b;
	}
	
	
	

}
