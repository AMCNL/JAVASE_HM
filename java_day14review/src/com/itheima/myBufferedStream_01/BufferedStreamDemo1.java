package com.itheima.myBufferedStream_01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamDemo1 {

	public static void main(String[] args) throws IOException {
		//�����ֽ����������
		//FileOutputStream fs = new FileOutputStream("aa.txt");
		
		//�����ֽڻ��������
		//BufferedOutputStream bos = new BufferedOutputStream(fs);
		
		//����������Ժϲ���һ��
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("aa.txt"));
		
		bos.write("hello".getBytes());
		
		//�ͷ���Դ
		bos.close();
		
		
		//�ֽڻ���������
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("aa.txt"));
		
		//һ�ζ�ȡһ���ֽ�
		/*int by;
		while((by = bis.read())!=-1){
			System.out.print((char)by);
		}*/
		
		//һ�ζ�ȡһ���ֽ�����
		byte[] bys = new byte[8];
		int len;
		while((len = bis.read(bys))!=-1){
			System.out.println(new String(bys, 0, len));
		}
		
		
		//���ǧ��������ͷ���Դ
		bis.close();
		

	}

}
