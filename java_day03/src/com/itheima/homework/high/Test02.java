package com.itheima.homework.high;
/*
		1.打印1到100之内的整数，但数字中包含9的要跳过
		2.每行输出5个满足条件的数，之间用空格分隔
		3.如：1 2 3 4 5
 */
public class Test02 {
	public static void main(String[] args) {
		
		int count=1;
		for(int i=1;i<100;i++){
			int ge = i%10;
			int shi = i/10%10;
			
			if(ge!=9 && shi!=9){
				System.out.print(i+" ");
				
				if(count%5==0){
					System.out.println();
				}
				count++;
				
				
			}
		}
	}

}
