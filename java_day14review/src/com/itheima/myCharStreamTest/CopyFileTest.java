package com.itheima.myCharStreamTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 5种方式复制文件：
 *    基本字符流一次读写一个字符
 *    基本字符流一次读写一个字符数组
 *    缓冲字符流一次读写一个字符
 *    缓冲字符流一次读写一个字符数组
 *    使用字符缓冲流特殊方法一次读取一个字符串
 *    
 */
public class CopyFileTest {

	public static void main(String[] args) throws Exception {
		
		method1();
		method2();
		method3();
		method4();
		method5();
		

	}
 
	//使用字符缓冲流特殊方法一次读取一个字符串
	private static void method5() throws IOException {
		//封装数据源
		BufferedReader br = new BufferedReader(new FileReader("b.txt"));
		//封装目的地
		BufferedWriter bw = new BufferedWriter(new FileWriter("Copyb.txt"));
		
		String line;
		while((line = br.readLine())!=null){
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		//释放资源
		bw.close();
		br.close();
		
	}


	//基本字符流一次读写一个字符
	private static void method1() throws Exception {
		//封装数据源
		FileReader fr = new FileReader("b.txt");
		//封装目的地
		FileWriter fw = new FileWriter("Coypb.txt");
		
		int ch;
		while((ch = fr.read())!=-1){
			fw.write(ch);
		}
		
		fw.close();
		fr.close();

	}
	
	//基本字符流一次读写一个字符数组
	private static void method2() throws Exception {
		//封装数据源
		FileReader fr = new FileReader("b.txt");
		//封装目的地
		FileWriter fw = new FileWriter("Coypb.txt");
		
		char[] chs = new char[1024];
		int len;
		while((len = fr.read(chs))!=-1){
			fw.write(chs,0,len);
		}
		
		fw.close();
		fr.close();


	}
	
	//字符缓冲区流一次读取一个字符
	private static void method3() throws Exception {
		//封装数据源
		BufferedReader br = new BufferedReader(new FileReader("b.txt"));
		//封装目的地
		BufferedWriter bw = new BufferedWriter(new FileWriter("Copyb.txt"));
		
		int ch;
		while((ch = br.read())!=-1){
			bw.write(ch);
		}
		
		bw.close();
		br.close();
		
	}
	
	//字符缓冲区流一次读取一个字符
	private static void method4() throws Exception {
		//封装数据源
		BufferedReader br = new BufferedReader(new FileReader("b.txt"));
		//封装目的地
		BufferedWriter bw = new BufferedWriter(new FileWriter("Copyb.txt"));
		
		char[] chs = new char[1024];
		int len;
		while((len = br.read(chs))!=-1){
			bw.write(chs,0,len);
		}
		
		bw.close();
		br.close();
		
	}
	
	
	
}
