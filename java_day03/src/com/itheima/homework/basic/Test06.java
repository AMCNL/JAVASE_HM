package com.itheima.homework.basic;

import java.util.Random;
import java.util.Scanner;

/*
 * ������С��Ϸ
 */
public class Test06 {
	public static void main(String[] args) {
	    Random rd = new Random();
	    int rdnum=rd.nextInt(100)+1;
		
		while(true){

			System.out.println("������һ�����֣�");
			Scanner sc = new Scanner(System.in);
			int gussnum=sc.nextInt();
			
			if(gussnum>rdnum){
				System.out.println("���µ������ˣ�");
			}else if(gussnum<rdnum){
				System.out.println("���µ���С�ˣ�");
			}else{
				System.out.println("��ϲ���¶��ˣ�");
				break;
			}
		}
		
	}

}
