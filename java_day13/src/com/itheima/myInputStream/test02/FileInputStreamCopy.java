package com.itheima.myInputStream.test02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/*
 * 复制文件到指定位置
 *    例：复制一个txt文档到本项目相对地址
 */
public class FileInputStreamCopy {

	public static void main(String[] args) throws IOException {
		
		long begin = new Date().getTime();
		//创建字节输入流对象（封装数据源）
		FileInputStream fis = new FileInputStream("E:\\黑马大数据3期\\基础班\\day13-day14预习资料\\day13\\resource\\窗里窗外.txt");
		//封装目的地文件
		FileOutputStream fos = new FileOutputStream("copy林青霞.txt");
		
		
		//一次写入一个字节:
		int by;
		while((by=fis.read())!=-1){
			fos.write(by);
		}
		
		
	/*	//一次写入一个字节数组
		//定义byte数组
		byte[] bys = new byte[1024*10];
		
		int len = 0;
		File f  = new File("copy林青霞.txt");
		while((len=fis.read(bys))!=-1){
//			
			fos.write(bys,0,len);//如果存在，会覆盖原来的文件
			
		}*/
		
		
		//关闭资源
		fos.close();
		fis.close();
		
		
		long end = new Date().getTime();
		System.out.println("耗时："+(end - begin)+"毫秒");
		

	}

}
