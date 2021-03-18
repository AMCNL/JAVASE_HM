package com.itheima.myInputStream.test01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

/*
 * 
 */

public class FileDemo {
	public static void main(String[] args) throws IOException {
		
		//创建字节输入流对象
		FileInputStream fis = new FileInputStream("FileInputSteam.txt");
		
		
		
		//创建时间对象
		Date date = new Date();
		
	   long start = date.getTime();
	   
	   //每次获取一个字节
		int by = fis.read();
		while(by!=-1){
			//System.out.println(by);
			System.out.print((char)by);
			by = fis.read();
		}
		
		
		Date date1 = new Date();
		
		long end = date1.getTime();
		
		System.out.println("读取时间耗时:"+(end - start)+"毫秒");
		fis.close();
		
		
		
		
		
	}

}
