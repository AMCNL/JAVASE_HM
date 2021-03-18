package com.itheima.myBufferedStream_02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyAbvTest {

	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		
		
		method1();           //��ʱ����10���ӣ�û���ü�����
		//method2();		//����ʱ987����
		//method3();     //����ʱ4154����
		//method4();     //����ʱ258����
		
		
		
		
		long end = System.currentTimeMillis();
		
		
		System.out.println("����ʱ"+(end - start)+"����");
		

	}
	//�ֽڻ�����һ�ζ�ȡһ���ֽ�����
	private static void method4() throws IOException {
		//��װ����Դ
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\aa.avi"));
		
		//��װĿ�ĵ�
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
	
	//�ֽڻ�����һ�ζ�ȡһ���ֽ�
	private static void method3() throws IOException {
		//��װ����Դ
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\aa.avi"));
		
		//��װĿ�ĵ�
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\tv\\bb.avi"));
		
		int by;
		while((by = bis.read())!=-1){
			bos.write(by);
		}
		
		//�ͷ���Դ
		bos.close();
		bis.close();
	}
	
	
	//�����ֽ���һ�ζ�ȡһ���ֽ�����
		private static void method2() throws IOException {
			//	    ��װ����Դ
			FileInputStream fis = new FileInputStream("E:\\aa.avi");
			//	  ��װĿ�ĵ�
			FileOutputStream fos = new FileOutputStream("E:\\tv\\bb.avi");
			
			byte[] bys = new byte[1024];
			int len;
			while((len = fis.read(bys))!=-1){
				fos.write(bys,0,len);
			}
			
			fos.close();
			fis.close();	
		}

	//�����ֽ���һ�ζ�ȡһ���ֽ�
	private static void method1() throws IOException {
		//	    ��װ����Դ
		FileInputStream fis = new FileInputStream("E:\\aa.avi");
		//	  ��װĿ�ĵ�
		FileOutputStream fos = new FileOutputStream("E:\\tv\\bb.avi");
		
		int by;
		while((by = fis.read())!=-1){
			fos.write(by);
		}
		
		fos.close();
		fis.close();	
	}
	
	
	
	
		

}
