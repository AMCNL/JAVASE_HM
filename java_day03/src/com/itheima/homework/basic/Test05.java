package com.itheima.homework.basic;
/*
 * �밴����Ҫ���д����,��ӡ�˵�:
		2��һ�д�ӡˮ�ɻ������м��ÿո������,����ӡˮ�ɻ��������
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
