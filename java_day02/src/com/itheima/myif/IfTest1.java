package com.itheima.myif;
/*
 *
 */
import java.util.Scanner;

public class IfTest1 {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("������һ������");
		int x = sc.nextInt();
		int y;
		if(x>=3){
			y=2*x+1;
			
		}else if(x>=-1 && x<3){
			y=2*x;
			
		}else if(x<=-1){
			y=2*x-1;
			
		}else{
			y=-1;
			System.out.println("����������ݲ����ڣ�");
		}
        System.out.println("y:"+y);
	}

}
