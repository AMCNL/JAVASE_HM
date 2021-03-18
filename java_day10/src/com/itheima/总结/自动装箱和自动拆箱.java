package com.itheima.总结;

public class 自动装箱和自动拆箱 {

	public static void main(String[] args) {
		/*
		 * 自动装箱：
		 * 		由基本类型转为包装类型
		 * 自动拆箱：
		 * 		由包装类型转为基本类型
		 */
		Integer i = 100; //自动装箱;valueOf(i)
		
		int ii = 200;  
		
		i +=ii;  //，自动拆箱（内），自动装箱（外）;valueOf( intValue( i ) + ii )
		
		System.out.println(i);

	}

}
