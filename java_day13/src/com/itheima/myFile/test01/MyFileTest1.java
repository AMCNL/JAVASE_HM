package com.itheima.myFile.test01;
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
		
		
		File f1 = new File("e:\\dsj\\315.txt");
		
		File f2= new File("e:\\dsj","315.txt");
		
		File f3 = new File("e:\\dsj");
		File f4 = new File(f3,"315.txt");
		
		//����f1��f2��f4���ֱ�����ͬ�������飬���ǰ�e:\\dsj\\315.txtת��Ϊ��һ��file����
		
		
	}

}
