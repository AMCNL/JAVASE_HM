package com.itheima.myBufferedStream02_review;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *���ַ�ʽ�Ƚϸ���Ч��:
 *
 *�����ֽ���һ�ζ�дһ���ֽ�    				����ʱ��163971����
 *�����ֽ���һ�ζ�дһ���ֽ�����			����ʱ��214����
 *�����ֽ���һ�ζ�дһ���ֽ�				����ʱ��575����
 *�����ֽ���һ�ζ�дһ���ֽ�����			����ʱ��55����	
 * 
 */
public class BufferedStreamDemo01 {

	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		
//		method1();
//		method2();
//  	method3();
	    method4();
		
		
		
		long end = System.currentTimeMillis();
		  
		  System.out.println("���ƹ���ʱ��"+(end - start)+"����");
		
		
		
	}

	private static void method4() throws IOException {
		//�����ֽڻ���������
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\aa.avi"));
		
		////�����ֽڻ������
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\tv\\bb.avi"));
		
		byte[] bys = new byte[1024];
		int len;
		while((len = bis.read(bys))!=-1){
			bos.write(bys,0,len);
		}
		
		
		//�ͷ���Դ
		
		bos.close();
		bis.close();
	}

	
	  
	//�����ֽ���һ�ζ�дһ���ֽ�
	/*private static void method1() throws IOException {
		
		FileInputStream fis = new FileInputStream("E:\\���������3��\\������\\day13-day14Ԥϰ����\\day14\\avi\\14.16_�ַ�������ϰ֮�Ѽ����е��ַ������ݴ洢���ı��ļ�.avi");
		
		FileOutputStream fos = new FileOutputStream("16.avi");
		
		int by;
		while((by=fis.read())!=-1){
			fos.write(by);
		}
		
	}
	
	//�����ֽ���һ�ζ�дһ���ֽ�����
	private static void method2() throws IOException {
		
		FileInputStream fis = new FileInputStream("E:\\���������3��\\������\\day13-day14Ԥϰ����\\day14\\avi\\14.16_�ַ�������ϰ֮�Ѽ����е��ַ������ݴ洢���ı��ļ�.avi");
		
		FileOutputStream fos = new FileOutputStream("16.avi");
		
		
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = fis.read(bys))!=-1){
			fos.write(bys, 0, len);
		}
		
	}
	
	//�����ֽ���һ�ζ�дһ���ֽ�
	private static void method3() throws IOException {
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\���������3��\\������\\day13-day14Ԥϰ����\\day14\\avi\\14.16_�ַ�������ϰ֮�Ѽ����е��ַ������ݴ洢���ı��ļ�.avi"));
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("16.avi"));
		
		int by;
		while((by=bis.read())!=-1){
			bos.write(by);
		}
		
	}
*/	
	//�����ֽ���һ�ζ�дһ���ֽ�
		

}
