package com.itheima.myInputStream.test02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制文件到指定位置
 *    例：复制图片
 */
public class FileInputStreamCopy2 {

	public static void main(String[] args) throws IOException{
		//封装数据源
		FileInputStream fis = new FileInputStream("E:\\莉莉\\莉莉图片\\IMG_20171216_165930.jpg");
		//封装目的地文件
		FileOutputStream fos = new FileOutputStream("LILI.jpg");
		
		
		//每次写入一个字节
		int by;
		while((by = fis.read())!=-1){
			fos.write(by);
		}
		
		
		
		
		//定义字节数组,每次写入一个字节数组
		byte[] bys = new byte[1024];
		int len = 0;
		while((len = fis.read(bys))!=-1){
			fos.write(bys, 0, len);
		}
		
		fos.close();
		fis.close();

	}

}
