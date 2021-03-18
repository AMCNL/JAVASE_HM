package com.itheima.myBufferedStream02_review;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *四种方式比较复制效率:
 *
 *基本字节流一次读写一个字节    				共耗时：163971毫秒
 *基本字节流一次读写一个字节数组			共耗时：214毫秒
 *缓冲字节流一次读写一个字节				共耗时：575毫秒
 *缓冲字节流一次读写一个字节数组			共耗时：55毫秒	
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
		  
		  System.out.println("复制共耗时："+(end - start)+"毫秒");
		
		
		
	}

	private static void method4() throws IOException {
		//创建字节缓冲输入流
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\aa.avi"));
		
		////创建字节缓冲出流
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\tv\\bb.avi"));
		
		byte[] bys = new byte[1024];
		int len;
		while((len = bis.read(bys))!=-1){
			bos.write(bys,0,len);
		}
		
		
		//释放资源
		
		bos.close();
		bis.close();
	}

	
	  
	//基本字节流一次读写一个字节
	/*private static void method1() throws IOException {
		
		FileInputStream fis = new FileInputStream("E:\\黑马大数据3期\\基础班\\day13-day14预习资料\\day14\\avi\\14.16_字符流的练习之把集合中的字符串数据存储到文本文件.avi");
		
		FileOutputStream fos = new FileOutputStream("16.avi");
		
		int by;
		while((by=fis.read())!=-1){
			fos.write(by);
		}
		
	}
	
	//基本字节流一次读写一个字节数组
	private static void method2() throws IOException {
		
		FileInputStream fis = new FileInputStream("E:\\黑马大数据3期\\基础班\\day13-day14预习资料\\day14\\avi\\14.16_字符流的练习之把集合中的字符串数据存储到文本文件.avi");
		
		FileOutputStream fos = new FileOutputStream("16.avi");
		
		
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = fis.read(bys))!=-1){
			fos.write(bys, 0, len);
		}
		
	}
	
	//缓冲字节流一次读写一个字节
	private static void method3() throws IOException {
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\黑马大数据3期\\基础班\\day13-day14预习资料\\day14\\avi\\14.16_字符流的练习之把集合中的字符串数据存储到文本文件.avi"));
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("16.avi"));
		
		int by;
		while((by=bis.read())!=-1){
			bos.write(by);
		}
		
	}
*/	
	//缓冲字节流一次读写一个字节
		

}
