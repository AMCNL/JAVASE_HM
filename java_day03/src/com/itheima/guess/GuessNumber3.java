package com.itheima.guess;

import java.util.Random;
import java.util.Scanner;

/*
 * ������С��Ϸ��V3.0����û���
 */
public class GuessNumber3 {
	public static void main(String[] args) {
		//ϵͳ����һ�������
		Scanner scname = new Scanner(System.in);
		System.out.println("����������������");
		String name = scname.nextLine();
		
		Random random = new Random();
		//���������������ΧΪ1-100
		int number = random.nextInt(10)+1;
		int count=8;
		int scount=0;
		System.out.println("--��ӭ��--"+name+"--����������С��Ϸ  �汾V3.0�û�+��������+������------------");
		//���ü���¼����
		
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("��������Ҫ�µ����֣�1-10��");
			int guessNumber = sc.nextInt();
			
			//�ж�
			//��ѭ��
			count--;
			scount++;
			   if(count>0){
					if(guessNumber>number){
						System.out.println("���µ�����"+guessNumber+"���ˣ�������"+count+"�λ��ᣬ�����ٴ�����...");
					}else if(guessNumber<number){
						System.out.println("���µ�����"+guessNumber+"С�ˣ�������"+count+"�λ��ᣬ�����ٴ�����...");
					}else{
						if(scount==1){
							System.out.println("==���==������"+scount+"�β��У���ϲ�������¶��ˣ���������Ϊ��"+guessNumber);
						}else if(scount>=2 &&scount<=3){
							System.out.println("==����==������"+scount+"�β��У���ϲ�������¶��ˣ���������Ϊ��"+guessNumber);
						}else{
							System.out.println("=����һ��==������"+scount+"�β��У���ϲ�������¶��ˣ���������Ϊ��"+guessNumber);	
						}
						
						break;
					}
			   }else{
				   System.out.println("sorry�����Ĵ����Ѿ����꣡��ӭ�´�����...");
				   System.out.println("-------------------------------------------------");
				   break;
			   }
			
		}
	
		
		
		
	}
   
}
