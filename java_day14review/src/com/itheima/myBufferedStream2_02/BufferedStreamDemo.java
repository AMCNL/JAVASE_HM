 package com.itheima.myBufferedStream2_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 字符缓冲流的特殊功能：
 *     BufferedWriter：
 *         newLine();   //换行，根据系统匹配
 *         
 *    BufferedReader:
 *         readLine();    //一次读取一行，不包含结束符号
 */
public class BufferedStreamDemo {

	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(new FileWriter("aa.txt"));
		
		/*for (int i = 0; i <3; i++) {
			bw.write("hello");
			bw.newLine();
			bw.flush();
		}*/
		
	
		
		
		BufferedReader br = new BufferedReader(new FileReader("aa.txt"));
		
		//***重点***
		String line;
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
		
		bw.close();
	}

}
