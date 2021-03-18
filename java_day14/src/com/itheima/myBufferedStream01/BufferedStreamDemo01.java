package com.itheima.myBufferedStream01;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 字节缓冲区流：
 * BufferedOutputStream:字节缓冲输出流
 * BufferedInputStream:字节缓冲输入流
 * 
 * BufferedOutputStream(),使用它的构造方法，会默认提供一个缓冲区大小，默认我们使用就行
 * 
 * 为甚么构造方法传递的参数是一个OutputStream，而不是具体的文件或者路径呢？
 *   答：字节缓冲区仅仅提供缓冲区，而真正的底层的读写操作数据还的需要基本的就对象进行操作
 * 
 */
public class BufferedStreamDemo01 {

	public static void main(String[] args) throws IOException {
		//创建缓冲区对象，并传递参数
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("a.txt"));

		//调用写入方法
		bos.write("hello".getBytes());
		
		
		//关闭资源
		bos.close();
		
		
		
		
	}

}
