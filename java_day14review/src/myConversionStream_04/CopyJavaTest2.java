package myConversionStream_04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * �ѱ�java�ļ����Ƶ���ǰĿ¼�µ�Copy.java��(�Ľ���)
 * 
 *  FileReader = InputStreamReader + �����ϵͳĬ�ϣ�
 *  
 *  FileWriter = OutputStreamWriter + �����ϵͳĬ�ϣ�
 *  
 *  ע�⣺���ϵȺ�ǰ������ʹ�õı�����ǵ�ǰϵͳĬ�ϵı������Ҫʹ���������������Ҫʹ�õȺź�������
 */
public class CopyJavaTest2 {

	public static void main(String[] args) throws IOException {
		//��ס����Դ
		FileReader fr = new FileReader("CopyJavaTest.java");
		
		//��װĿ�ĵ�
		FileWriter fw = new FileWriter("Copy.java");
		
		//һ�ζ�дһ���ַ�
		/*int ch;
		while((ch = fr.read())!=-1){
			fw.write(ch);
		}*/
		
		//һ�ζ�ȡһ���ַ�����
		char[] chs = new char[1024];
		int len;
		while((len = fr.read(chs))!=-1){
			fw.write(chs, 0, len);
		}
		fw.close();
		fr.close();
		

	}

}
