package com.itheima.myConversionStream05;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 *需求：把项目目录下的a.txt内容复制到项目目录下的b.txt中
	分析：
	第一步:创建BufferedReader关联a.txt
	第二步:创建BufferedWriter关联b.txt
	第三步:读写操作
	第四步:关闭流释放资源

 */
public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		
		long start = System.currentTimeMillis();
		
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt"));
		
		char[] ch = new char[1024];
		int len;
		while((len = br.read(ch))!=-1){
			bw.write(ch,0,len);
		}
		System.out.println("----");
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
		
		
		bw.close();
		br.close();
		

	}

}
