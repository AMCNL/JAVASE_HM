package com.itheima.myBufferedStream2_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符缓冲区流
 *    字符缓冲输出流：
 *        BufferedWriter(Writer out)
 *    字符缓冲输入流
 *        BufferedReader(Reader in)
 *        
 */
public class BufferedStreamDemo {

	public static void main(String[] args) throws Exception {
		//创建字符缓冲输出流对象
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		
		bw.write("hello缓冲字符流");
		
		bw.close();
		
		
		//创建字符缓冲输入流对象
		BufferedReader br = new BufferedReader(new FileReader("OutputStreamWriterDemo.java"));
		
		//一次读取一个字符
		/*int ch;
		while((ch = br.read())!=-1){
			System.out.print((char)ch);
		}*/
		
		//一次读取一个字符数组
		char[] chs = new char[1024];
		//实际读取长度
		int len;
		while((len = br.read(chs))!=-1){
			System.out.print(new String(chs,0,len));
			
		}
		
		//释放资源
		br.close();
	}

}
