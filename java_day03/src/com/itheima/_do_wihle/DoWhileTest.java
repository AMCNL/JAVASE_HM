package com.itheima._do_wihle;
/*
 * 使用do while打印水仙花数
 */
public class DoWhileTest {

	public static void main(String[] args) {
		//初始化语句
		int i = 100;
		do{
			
			//循环语句
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/100%10;
			
			
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai == i){
				System.out.println(i);
			}
			
			//控制条件语句
			i++;
		}while(i<=999);//判断条件语句

	}

}
