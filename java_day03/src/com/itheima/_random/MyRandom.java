package com.itheima._random;

import java.util.Random;

/*
 * 使用random获取1-100的一个随机数
 */
public class MyRandom {
	public static void main(String[] args) {
		Random rd = new Random();
		//设置范围[0-99]+1=[1-100]
		
		
		//循环输出10个
		for (int i = 0; i < 10; i++) {
			int number=rd.nextInt(100)+1;
			
			
			System.out.println(number);
		}
		
	}

}
