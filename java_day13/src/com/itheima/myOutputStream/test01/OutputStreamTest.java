package com.itheima.myOutputStream.test01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * ���� : ��ǰ��Ŀ�µ�info.txt�ļ���д��abdcd5���ַ�

 ����:
	��һ��: ����������������info.txt
	�ڶ���: ����writer����д������
	������: �ͷ���Դ

 */
public class OutputStreamTest {

	public static void main(String[] args) throws IOException {
		//�����ֽ����������
		OutputStream os = new FileOutputStream("info.txt");
		os.write('a');
		os.write(98);
		
		os.write(100);
		os.write(99);
		os.write(100);
		
		//�ر���Դ
		os.close();
		
		//�����ֽ����������
		FileOutputStream fos = new FileOutputStream("info.txt");
		fos.write('a');
		fos.write(98);
		
		fos.write(100);
		fos.write(99);
		fos.write(100);
		
		//�ر���Դ
		fos.close();

	}

}
