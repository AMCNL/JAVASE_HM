package com.itheima.myOutputStream.test01;
/*
 * 如何实现数据的换行:
 *   根据os的不同换行系统也是不同的
 *   win：\r\n
 *   linux:\n
 *   mac:\r
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 字符流
 */

public class OutputStreamDemo3 {
	public static void main(String[] args) throws IOException {

		//创建字节输出流对象
		FileOutputStream fos = new FileOutputStream("bb.txt");
		
		for (int i = 0; i < 10; i++) {
			fos.write("hello".getBytes());
			fos.write("\n".getBytes());
		}
	}

}
