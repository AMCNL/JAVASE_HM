package com.itheima.myInputStream.test01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

/*
 * 
 */

public class FileDemo {
	public static void main(String[] args) throws IOException {
		
		//�����ֽ�����������
		FileInputStream fis = new FileInputStream("FileInputSteam.txt");
		
		
		
		//����ʱ�����
		Date date = new Date();
		
	   long start = date.getTime();
	   
	   //ÿ�λ�ȡһ���ֽ�
		int by = fis.read();
		while(by!=-1){
			//System.out.println(by);
			System.out.print((char)by);
			by = fis.read();
		}
		
		
		Date date1 = new Date();
		
		long end = date1.getTime();
		
		System.out.println("��ȡʱ���ʱ:"+(end - start)+"����");
		fis.close();
		
		
		
		
		
	}

}
