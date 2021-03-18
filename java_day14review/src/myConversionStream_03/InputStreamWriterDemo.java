package myConversionStream_03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * InputStreamReader�����ݵķ���
 *     һ�ζ�ȡһ���ַ�
 *     һ�ζ�ȡһ���ַ����� 
 *     
 */
public class InputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("OutputStreamWriterDemo.java"));

		//һ�ζ�ȡһ���ַ�
		/*int ch;
		while((ch = isr.read())!=-1){
			System.out.print((char)ch);
		}
		*/
		//һ�ζ�ȡһ���ַ�����
		char[] chs = new char[1024];
		int len;
		while((len = isr.read(chs))!=-1){
			System.out.print(new String(chs,0,len));
		}
		
		
		isr.close();

	}

}
