package com.itheima.guess;

import java.util.Random;
import java.util.Scanner;

/*
 * ������С��Ϸ��V2.0�������ư�
 */
public class GuessNumber2 {
	public static void main(String[] args) {
		//ϵͳ����һ�������
		Random random = new Random();
		//���������������ΧΪ1-100
		int number = random.nextInt(100)+1;
		int count=5;
		System.out.println("---------------��ӭ����������С��Ϸ  �汾V2.0�������ư�------------");
		//���ü���¼����
		
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("��������Ҫ�µ����֣�1-100��");
			int guessNumber = sc.nextInt();
			
			//�ж�
			//��ѭ��
			count--;
			   if(count>0){
					if(guessNumber>number){
						System.out.println("���µ�����"+guessNumber+"���ˣ�������"+count+"�λ��ᣬ�����ٴ�����...");
					}else if(guessNumber<number){
						System.out.println("���µ�����"+guessNumber+"С�ˣ�������"+count+"�λ��ᣬ�����ٴ�����...");
					}else{
						System.out.println("��ϲ�������¶��ˣ���������Ϊ��"+guessNumber);
						return;
					}
			   }else{
				   System.out.println("sorry�����Ĵ����Ѿ����꣡��ӭ�´�����...");
				   System.out.println("-------------------------------------------------");
				   return;
			   }
			
		}
	
		
		
		
	}
   
}
