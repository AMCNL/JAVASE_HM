package com.itheima.myOutputStream.test01;
/*
 * ���ʵ�����ݵĻ���:
 *   ����os�Ĳ�ͬ����ϵͳҲ�ǲ�ͬ��
 *   win��\r\n
 *   linux:\n
 *   mac:\r
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �ַ���
 */

public class OutputStreamDemo3 {
	public static void main(String[] args) throws IOException {

		//�����ֽ����������
		FileOutputStream fos = new FileOutputStream("bb.txt");
		
		for (int i = 0; i < 10; i++) {
			fos.write("hello".getBytes());
			fos.write("\n".getBytes());
		}
	}

}
