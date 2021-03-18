package myConversionStream_04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * �ѱ�java�ļ����Ƶ���ǰĿ¼�µ�Copy.java��
 */
public class CopyJavaTest {

	public static void main(String[] args) throws IOException {
		//��ס����Դ
		InputStreamReader isr = new InputStreamReader(new FileInputStream("CopyJavaTest.java"));
		
		//��װĿ�ĵ�
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Copy.java"));
		
		//һ�ζ�дһ���ַ�
		/*int ch;
		while((ch = isr.read())!=-1){
			osw.write(ch);
			
		}*/
		
		//һ��д��һ���ַ�����
		char[] chs = new char[1024];
		int len;
		while((len = isr.read(chs))!=-1){
			osw.write(chs, 0, len);
		}
		
		//�ͷ���Դ
		osw.close();
		isr.close();

	}

}
