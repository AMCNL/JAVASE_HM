package com.itheima.myif;

import java.util.Scanner;

/*
 * ����¼��ѧ�����Գɼ������ݳɼ��жϸ�ѧ�������ĸ�����
     90-100������90��100��      ����
     80-90������80������90��    ��
     70-80 ������70������80��   ��
     60-70 ������60������70��   ����
     60������ ��������60��       ������

 */
public class IfTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//��ʾ
		System.out.print("������ɼ���");
		int score = sc.nextInt();
		
		if(score>100 || score<0){
			System.out.println("������ĳɼ����Ϸ���");
		}else if(score>=90 && score<=100){
			System.out.println("����");
		}else if(score>=80 && score<90){
			System.out.println("��");
		}else if(score>=70 && score<80){
			System.out.println("����");
		}else if(score>=60 && score<70){
			System.out.println("����");
		}else{
			System.out.println("������");
		}

	}

}
