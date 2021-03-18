package com.itheima.myBufferedStream2_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 使用字符缓冲区流复制文件
 *   需求：将项目目录下的a.txt复制到项目目录到CopyA.txt
 *   
 */
public class CopyTest {

	public static void main(String[] args) throws Exception {
		// 封装数据源
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		//封装目的地文件
		BufferedWriter bw = new BufferedWriter(new FileWriter("CopyA.txt"));
		
		//一次读取一个字符
		/*int ch;
		while((ch = br.read())!=-1){
			bw.write(ch);
		}
		*/
		
		//一次读取一个字符数组
		char[] chs = new char[1024];
		int len;
		while((len = br.read(chs))!=-1){
			bw.write(chs,0,len);
		}
		
		//释放资源
		bw.close();
		br.close();
		
	}

}
