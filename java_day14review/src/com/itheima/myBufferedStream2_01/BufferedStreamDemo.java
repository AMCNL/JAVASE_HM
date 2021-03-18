package com.itheima.myBufferedStream2_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ���������
 *    �ַ������������
 *        BufferedWriter(Writer out)
 *    �ַ�����������
 *        BufferedReader(Reader in)
 *        
 */
public class BufferedStreamDemo {

	public static void main(String[] args) throws Exception {
		//�����ַ��������������
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		
		bw.write("hello�����ַ���");
		
		bw.close();
		
		
		//�����ַ���������������
		BufferedReader br = new BufferedReader(new FileReader("OutputStreamWriterDemo.java"));
		
		//һ�ζ�ȡһ���ַ�
		/*int ch;
		while((ch = br.read())!=-1){
			System.out.print((char)ch);
		}*/
		
		//һ�ζ�ȡһ���ַ�����
		char[] chs = new char[1024];
		//ʵ�ʶ�ȡ����
		int len;
		while((len = br.read(chs))!=-1){
			System.out.print(new String(chs,0,len));
			
		}
		
		//�ͷ���Դ
		br.close();
	}

}
