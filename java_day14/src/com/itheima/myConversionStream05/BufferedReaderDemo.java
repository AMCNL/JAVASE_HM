package com.itheima.myConversionStream05;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 *���󣺰���ĿĿ¼�µ�a.txt���ݸ��Ƶ���ĿĿ¼�µ�b.txt��
	������
	��һ��:����BufferedReader����a.txt
	�ڶ���:����BufferedWriter����b.txt
	������:��д����
	���Ĳ�:�ر����ͷ���Դ

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
