package com.itheima.myBufferedStream2_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * 使用字符缓冲区流的特殊功能进行文件复制
 *     newLine()
 *     readLine()
 */
public class CopyJavaTest {

	public static void main(String[] args) throws Exception {
		//封装数据源
		BufferedReader br = new BufferedReader(new FileReader("aa.txt"));
		//封装目的地
		BufferedWriter bw = new BufferedWriter(new FileWriter("CopyAA.txt"));
		
		//读写操作
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

}
