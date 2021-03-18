package com.itheima.myOutputStream.test01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 字节输出流写入一个字节数组
 */

public class OutputStreamDemo2 {
	public static void main(String[] args) throws IOException {

		// 创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("bb.txt");

		// 创建字节数组
		byte[] bys = { 65, 66, 67, 68, 69 };

		// 调用写入方法写入数据，把byte数组放进去
		fos.write(bys);

		// 需求：如果想要写入的是一个字符串String.getBytes();
		String str = "abcdef";

		// byte[] bys1 = str.getBytes();
		// fos.write(bys1);

		// 简写
		fos.write(str.getBytes());

		// 释放资源
		fos.close();
	}

}
