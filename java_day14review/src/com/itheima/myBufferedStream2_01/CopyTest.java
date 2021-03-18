package com.itheima.myBufferedStream2_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ʹ���ַ��������������ļ�
 *   ���󣺽���ĿĿ¼�µ�a.txt���Ƶ���ĿĿ¼��CopyA.txt
 *   
 */
public class CopyTest {

	public static void main(String[] args) throws Exception {
		// ��װ����Դ
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		//��װĿ�ĵ��ļ�
		BufferedWriter bw = new BufferedWriter(new FileWriter("CopyA.txt"));
		
		//һ�ζ�ȡһ���ַ�
		/*int ch;
		while((ch = br.read())!=-1){
			bw.write(ch);
		}
		*/
		
		//һ�ζ�ȡһ���ַ�����
		char[] chs = new char[1024];
		int len;
		while((len = br.read(chs))!=-1){
			bw.write(chs,0,len);
		}
		
		//�ͷ���Դ
		bw.close();
		br.close();
		
	}

}
