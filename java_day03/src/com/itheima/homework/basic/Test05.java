package com.itheima.homework.basic;
/*
 * 请按如下要求编写程序,打印菜单:
		2个一行打印水仙花数（中间用空格隔开）,最后打印水仙花输的总数
 */
public class Test05 {
	public static void main(String[] args) {
		int count=0;
		for(int i=100;i<=999;i++){
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/10/10%10;
			
			int sum = (ge*ge*ge+shi*shi*shi+bai*bai*bai);
			if(sum==i){
				if(count==0){
					System.out.print("");
				}else{
					if(count%2==0){
						System.out.println();
					}
				}
				
				System.out.print(sum+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
	}

}
