package com.itheima.myBufferedStream_01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamDemo1 {

	public static void main(String[] args) throws IOException {
		//创建字节输出流对象
		//FileOutputStream fs = new FileOutputStream("aa.txt");
		
		//创建字节缓冲输出流
		//BufferedOutputStream bos = new BufferedOutputStream(fs);
		
		//以上两句可以合并成一句
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("aa.txt"));
		
		bos.write("hello".getBytes());
		
		//释放资源
		bos.close();
		
		
		//字节缓冲输入流
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("aa.txt"));
		
		//一次读取一个字节
		/*int by;
		while((by = bis.read())!=-1){
			System.out.print((char)by);
		}*/
		
		//一次读取一个字节数组
		byte[] bys = new byte[8];
		int len;
		while((len = bis.read(bys))!=-1){
			System.out.println(new String(bys, 0, len));
		}
		
		
		//最后千万别忘了释放资源
		bis.close();
		

	}

}
