package com.itheima.myOutputStream.test01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ַ���
 */

public class OutputStreamDemo {
	public static void main(String[] args) throws IOException {

		//�����ֽ����������
		FileOutputStream fos = new FileOutputStream("aa.txt");

		//����д����������
		fos.write('m');
		fos.write(48);
		//�ͷ���Դ
		fos.close();
	}

}
