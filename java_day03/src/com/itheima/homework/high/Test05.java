package com.itheima.homework.high;

import java.util.Random;
import java.util.Scanner;

/*
 * 某商场实行新的抽奖规则：如果会员号的百位数字等于产生的随机数字，
 * 则该会员为幸运会员，且实现以下要求：
 * 从键盘上接收会员号,使用if-else选择结构实现幸运抽奖
 * 
 *  1.产生随机数
	2.从控制台接收一个4位会员号
	3.分解获得的百位数字
	4.判断该会员是否是幸运会员
    5.按照格式打印
 */
public class Test05 {
	public static void main(String[] args) {
		//创建键盘录入对象
		Random rd = new Random();
		
		//定义随机数变量，接收随机数1-9
		int num = rd.nextInt(9)+1;
		
		
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入您的会员卡号！");
		//定义一个会员号变量，接收键盘录入的数据
		int IdNum = sc.nextInt();
		
		//解决百位
		int bai = IdNum/100%10;
		
		System.out.println("幸运数字为："+num);
		//条件判断
		if(bai == num){
			//符合条件打印输出
			System.out.println("恭喜您为幸运会员！");
		}else{
			
			System.out.println("谢谢参与！");
		}
	
		
	}

}
