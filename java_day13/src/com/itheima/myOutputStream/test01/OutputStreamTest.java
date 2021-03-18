package com.itheima.myOutputStream.test01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * 需求 : 向当前项目下的info.txt文件中写出abdcd5个字符

 分析:
	第一步: 创建输出流对象关联info.txt
	第二步: 调用writer方法写出数据
	第三步: 释放资源

 */
public class OutputStreamTest {

	public static void main(String[] args) throws IOException {
		//创建字节输出流对象
		OutputStream os = new FileOutputStream("info.txt");
		os.write('a');
		os.write(98);
		
		os.write(100);
		os.write(99);
		os.write(100);
		
		//关闭资源
		os.close();
		
		//创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("info.txt");
		fos.write('a');
		fos.write(98);
		
		fos.write(100);
		fos.write(99);
		fos.write(100);
		
		//关闭资源
		fos.close();

	}

}
