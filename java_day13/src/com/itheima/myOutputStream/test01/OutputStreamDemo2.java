package com.itheima.myOutputStream.test01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ֽ������д��һ���ֽ�����
 */

public class OutputStreamDemo2 {
	public static void main(String[] args) throws IOException {

		// �����ֽ����������
		FileOutputStream fos = new FileOutputStream("bb.txt");

		// �����ֽ�����
		byte[] bys = { 65, 66, 67, 68, 69 };

		// ����д�뷽��д�����ݣ���byte����Ž�ȥ
		fos.write(bys);

		// ���������Ҫд�����һ���ַ���String.getBytes();
		String str = "abcdef";

		// byte[] bys1 = str.getBytes();
		// fos.write(bys1);

		// ��д
		fos.write(str.getBytes());

		// �ͷ���Դ
		fos.close();
	}

}
