package com.itheima.methodShuiXH;
/*
 * 定义一个方法，打印100-999之间水仙花数
	要求：注释中写明需求
	          注释中写明方法的返回值类型
	          注释中写明方法的参数类型及个数
       主方法中调用该方法，控制台输出水仙花数

 */
public class Test01 {
	public static void main(String[] args) {
		printFlower();
	}
	
	
	/*
	 * 参数类型：void
	 * 参数列表：
	 */
	public static void printFlower(){
		
		for(int i=100;i<1000;i++){
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/10/10%10;
			
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai == i){
				System.out.println(i);
			}
		}
	}

}
