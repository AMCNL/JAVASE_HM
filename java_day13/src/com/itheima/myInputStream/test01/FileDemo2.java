package com.itheima.myInputStream.test01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

/*
 * 
 */

public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		
		//�����ֽ�����������
		FileInputStream fis = new FileInputStream("FileInputSteam.txt");
		
		
		
		//����ʱ�����
		Date date = new Date();
		
	   long start = date.getTime();
	   
	   //ÿ�λ�ȡһ���ֽ�
	   
//		int by = fis.read();
//		while(by!=-1){
//			System.out.print((char)by);
//			by = fis.read();
//		}
		
		
		//ÿ�ζ�ȡһ���ֽ�����
		
		byte[] bys = new byte[1024];
		
		int len = 0;
		while((len=fis.read(bys))!=-1){
			//System.out.println(len);//��ȡ���ֽ���
			System.out.println(new String(bys,0,len));
		}
		
		fis.close();
		Date date1 = new Date();
		
		long end = date1.getTime();
		
		System.out.println("��ȡʱ���ʱ:"+(end - start)+"����");
			
		
	}

}
