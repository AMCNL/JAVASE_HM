package com.itheima.shuixh;
/*
 * ˮ�ɻ�������λ�������������䱾��
 * �����ҳ�100-1000�е�ˮ�ɻ���
 */
public class ShuiXH {
    public static void main(String[] args) {
		//����100-1000����
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
    	System.out.println("1-1000��ˮ�ɻ��ĸ������У�"+count+"����");
	}
}
