package com.itheima.myInputStream.test01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

/*
 * 
 */

public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		
		//创建字节输入流对象
		FileInputStream fis = new FileInputStream("FileInputSteam.txt");
		
		
		
		//创建时间对象
		Date date = new Date();
		
	   long start = date.getTime();
	   
	   //每次获取一个字节
	   
//		int by = fis.read();
//		while(by!=-1){
//			System.out.print((char)by);
//			by = fis.read();
//		}
		
		
		//每次读取一个字节数组
		
		byte[] bys = new byte[1024];
		
		int len = 0;
		while((len=fis.read(bys))!=-1){
			//System.out.println(len);//读取的字节数
			System.out.println(new String(bys,0,len));
		}
		
		fis.close();
		Date date1 = new Date();
		
		long end = date1.getTime();
		
		System.out.println("读取时间耗时:"+(end - start)+"毫秒");
			
		
	}

}
