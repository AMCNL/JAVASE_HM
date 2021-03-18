package com.itheima.myConversionStream04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ����:�ѵ�ǰ��ĿĿ¼�µ�StringDemo.java���ݸ��Ƶ���ǰ��ĿĿ¼�µ�Copy.java
	����:
	��һ��: �����ַ���������ȡ�ļ�
	�ڶ���: �����ַ����������Ŀ���ļ�
	������: �Զ����ַ��������Ч��
	���Ĳ�: ���ϵĶ�д����
	���岽: �ر����ͷ���Դ

 */
public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		
		FileReader fr = new FileReader("LILI.jpg");
		
		//��װĿ�ĵ�
		FileWriter fw = new FileWriter("copy.jpg");
		
		char[] ch = new char[1024];
		int len;
		while((len = fr.read(ch))!=-1){
			fw.write(ch,0,len);
		}
		
		
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
		
		
		
		

	}

}
