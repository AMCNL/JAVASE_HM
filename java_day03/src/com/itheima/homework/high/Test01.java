package com.itheima.homework.high;
/*
 * �����������󣬲��ô���ʵ�֣�
	1.���������߶�Ϊ8848�ף���һ���㹻���ֽ�����Ϊ0.0001�ס�
	2.���ʣ����۵����ٴΣ������۳����������ĸ߶ȡ�
 */
public class Test01 {
	public static void main(String[] args) {
		int hight = 8848;
		
		double hd=0.0001D;
		
		int count=0;
		while(true){
			
			if(hd>hight){
				
				break;
			}
			hd+=hd;
			count++;
		}
		System.out.println("Ҫ�۵�"+count+"��");
	}

}
