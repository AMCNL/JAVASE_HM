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
		
		
		method1();           //耗时大于10分钟，没来得及测完
		//method2();		//共耗时987毫秒
		//method3();     //共耗时4154毫秒
		//method4();     //共耗时258毫秒
		
		
		
		
		long end = System.currentTimeMillis();
		
		
		System.out.println("共耗时"+(end - start)+"毫秒");
		

	}
	//字节缓冲流一次读取一个字节数组
	private static void method4() throws IOException {
		//封装数据源
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\aa.avi"));
		
		//封装目的地
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
	
	//字节缓冲流一次读取一个字节
	private static void method3() throws IOException {
		//封装数据源
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\aa.avi"));
		
		//封装目的地
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\tv\\bb.avi"));
		
		int by;
		while((by = bis.read())!=-1){
			bos.write(by);
		}
		
		//释放资源
		bos.close();
		bis.close();
	}
	
	
	//基本字节流一次读取一个字节数组
		private static void method2() throws IOException {
			//	    封装数据源
			FileInputStream fis = new FileInputStream("E:\\aa.avi");
			//	  封装目的地
			FileOutputStream fos = new FileOutputStream("E:\\tv\\bb.avi");
			
			byte[] bys = new byte[1024];
			int len;
			while((len = fis.read(bys))!=-1){
				fos.write(bys,0,len);
			}
			
			fos.close();
			fis.close();	
		}

	//基本字节流一次读取一个字节
	private static void method1() throws IOException {
		//	    封装数据源
		FileInputStream fis = new FileInputStream("E:\\aa.avi");
		//	  封装目的地
		FileOutputStream fos = new FileOutputStream("E:\\tv\\bb.avi");
		
		int by;
		while((by = fis.read())!=-1){
			fos.write(by);
		}
		
		fos.close();
		fis.close();	
	}
	
	
	
	
		

}
