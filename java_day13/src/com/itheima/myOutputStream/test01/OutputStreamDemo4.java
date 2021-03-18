package com.itheima.myOutputStream.test01;
/*
 * 写入字节数组的一部分
 */

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo4 {
	public static void main(String[] args) throws IOException {

		//创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("bb.txt");
		
		//创建字节数组
		byte[] bys = {65,66,67,68,69};
		
		//调用写入方法
		fos.write(bys, 0, 3);
		
		//关闭资源
		fos.close();
		
		
		
		
	}

}
