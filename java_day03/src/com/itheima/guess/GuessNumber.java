package com.itheima.guess;

import java.util.Random;
import java.util.Scanner;

/*
 * ������С��Ϸ
 */
public class GuessNumber {
	public static void main(String[] args) {
		//ϵͳ����һ�������
		Random random = new Random();
		//���������������ΧΪ1-100
		int number = random.nextInt(100)+1;
		System.out.println("---------------��ӭ����������С��Ϸ V1.0------------");
		//���ü���¼����
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("��������Ҫ�µ����֣�1-100��");
			int guessNumber = sc.nextInt();
			
			//�ж�
			//��ѭ��
		
			if(guessNumber>number){
				System.out.println("���µ�����"+guessNumber+"���ˣ������ٴ�����...");
			}else if(guessNumber<number){
				System.out.println("���µ�����"+guessNumber+"С�ˣ������ٴ�����...");
			}else{
				System.out.println("��ϲ�������¶��ˣ���������Ϊ��"+guessNumber);
				break;
			}
			
		}
	
		
		
		
	}

}
