package com.itheima.myOutputStream.test01;
/*
 * д���ֽ������һ����
 */

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo4 {
	public static void main(String[] args) throws IOException {

		//�����ֽ����������
		FileOutputStream fos = new FileOutputStream("bb.txt");
		
		//�����ֽ�����
		byte[] bys = {65,66,67,68,69};
		
		//����д�뷽��
		fos.write(bys, 0, 3);
		
		//�ر���Դ
		fos.close();
		
		
		
		
	}

}
