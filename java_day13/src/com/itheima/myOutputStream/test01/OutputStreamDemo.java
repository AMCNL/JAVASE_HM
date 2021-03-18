package com.itheima.myOutputStream.test01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 字符流
 */

public class OutputStreamDemo {
	public static void main(String[] args) throws IOException {

		//创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("aa.txt");

		//调用写方法的数据
		fos.write('m');
		fos.write(48);
		//释放资源
		fos.close();
	}

}
