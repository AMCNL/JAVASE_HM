package com.itheima.myConversionStream02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/*
 * ����: ��UTF-8����ĸ�ʽд�� ����á����ļ���, ����������ȷ�Ķ�ȡ������ӡ�ڿ���̨
	����:
	��һ��: ����OutputStreamWriter�����ļ�, ���ڹ��췽����ָ�������
	�ڶ���: ����writer����д���ַ���
	������: ����InputStreamReader�����ļ�, ���ڹ��췽����ָ�������ж�ȡ
	���Ĳ�: ����read������ȡ����, ��ӡ�ڿ���̨

 */
public class OutputStreamWriterDemo2 {
	public static void main(String[] args) throws IOException {
		
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"),"utf-8");
		String str = "���";
		
		osw.write(str);
		
		osw.close();
		
		
		InputStreamReader isr = new InputStreamReader(new FileInputStream("b.txt"),"utf-8");
		
		//һ�ζ�ȡһ���ַ�
		/*int ch;
		while((ch=isr.read())!=-1){
			
			System.out.print((char)ch);
		}
		
		isr.close();*/
		
		//һ�ζ�ȡһ���ַ�����
		char[] ch = new char[1024];
		int len;
		while((len = isr.read(ch))!=-1){
			System.out.println(new String(ch,0,len));
		}
		
		isr.close();
	}
}
