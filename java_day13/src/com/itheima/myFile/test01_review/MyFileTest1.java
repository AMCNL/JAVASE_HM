package com.itheima.myFile.test01_review;
/*
 * ����:ʹ��File������ֹ��췽����Ӳ���е��ļ����ļ���, ��װ��File����.
	����:
	��һ��: File(String pathname)
	�ڶ���: File(String parent, String child)
	������: File(File parent, String child)

 */
import java.io.File;

public class MyFileTest1 {
	public static void main(String[] args) {
		
		File f1 = new File("e:\\aa\\a.txt");
		
		File f2 = new File("e:\\aa","a.txt");
		
		
		File f3 = new File("e:\\aa");
		File f4 = new File(f3,"a.txt");
		
		//����f1��f2��f4������ͬһ�ַ�ʽ�����ǰ�"e:\\aa\\a.txt"ת��Ϊһ��File����
		
		
		
		
	}

}
