 package myConversionStream_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ConversionStreamDemo {
	public static void main(String[] args) throws IOException {
		
		//Ĭ�ϱ���
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"));
		
		//gbk����
		//OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream("osw.txt"),"gbk");
		
		//utf-8����
		//OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("osw.txt"),"utf-8");
		
		osw.write("���");
		
		osw.close();
		
		//����Ĭ�Ͻ���
		InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"));
		
		
		//����gbk����
		InputStreamReader isr1 = new InputStreamReader(new FileInputStream("osw.txt"),"gbk");
		
		
		//����utf-8����
		InputStreamReader isr2 = new InputStreamReader(new FileInputStream("osw.txt"),"utf-8");
				
		
		
		//һ�ζ�ȡһ���ַ�
		/*int ch;
		while((ch = isr.read())!=-1){
			System.out.println((char)ch);
		}*/
		
		
		//һ�ζ�ȡһ���ַ�����
		char[] chs = new char[8];
		int len;
		while((len = isr2.read(chs))!=-1){
			System.out.print(new String(chs, 0, len));
		}
		
		isr.close();
	}

}
