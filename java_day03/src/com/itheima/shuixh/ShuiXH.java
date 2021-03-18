package com.itheima.shuixh;
/*
 * 水仙花数：各位数的立方等于其本身
 * 需求：找出100-1000中的水仙花数
 */
public class ShuiXH {
    public static void main(String[] args) {
		//遍历100-1000个数
    	int count=0;
    	for(int i=100;i<=1000;i++){
    		int ge=i%10;
			int shi=i/10%10;
			int bai=i/10/10%10;
			int rs=ge*ge*ge+shi*shi*shi+bai*bai*bai;
			if(rs==i){
				System.out.println(rs);
				count++;
			}
		}
    	System.out.println("1-1000中水仙花的个数共有："+count+"个！");
	}
}
