package com.itheima.myBufferedStream01;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ֽڻ���������
 * BufferedOutputStream:�ֽڻ��������
 * BufferedInputStream:�ֽڻ���������
 * 
 * BufferedOutputStream(),ʹ�����Ĺ��췽������Ĭ���ṩһ����������С��Ĭ������ʹ�þ���
 * 
 * Ϊ��ô���췽�����ݵĲ�����һ��OutputStream�������Ǿ�����ļ�����·���أ�
 *   ���ֽڻ����������ṩ���������������ĵײ�Ķ�д�������ݻ�����Ҫ�����ľͶ�����в���
 * 
 */
public class BufferedStreamDemo01 {

	public static void main(String[] args) throws IOException {
		//�������������󣬲����ݲ���
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("a.txt"));

		//����д�뷽��
		bos.write("hello".getBytes());
		
		
		//�ر���Դ
		bos.close();
		
		
		
		
	}

}
