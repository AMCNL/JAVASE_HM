package com.itheima.homework.high;
/*
 * 分析以下需求，并用代码实现：
	1.珠穆朗玛峰高度为8848米，有一张足够大的纸，厚度为0.0001米。
	2.请问，我折叠多少次，可以折成珠穆朗玛峰的高度。
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
		System.out.println("要折叠"+count+"次");
	}

}
