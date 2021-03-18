package com.itheima._for;
/*
 * 循环的求和运算:1-100的偶数和，以及奇数和
 */
public class MyForTest4 {

	public static void main(String[] args) {
		//1-n数据之和
		
		int ouSum=0;
		int jiSum=0;
		for (int i = 1; i <=100; i++) {
			
			if(i%2 == 0){
				ouSum +=i;
			}else{
				jiSum +=i;
			}
		  
		}
		System.out.println(ouSum);
		System.out.println(jiSum);

	}

}
