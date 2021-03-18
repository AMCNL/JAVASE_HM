 package myConversionStream_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ConversionStreamDemo {
	public static void main(String[] args) throws IOException {
		
		//默认编码
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("osw.txt"));
		
		//gbk编码
		//OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream("osw.txt"),"gbk");
		
		//utf-8编码
		//OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("osw.txt"),"utf-8");
		
		osw.write("你好");
		
		osw.close();
		
		//采用默认解码
		InputStreamReader isr = new InputStreamReader(new FileInputStream("osw.txt"));
		
		
		//采用gbk解码
		InputStreamReader isr1 = new InputStreamReader(new FileInputStream("osw.txt"),"gbk");
		
		
		//采用utf-8解码
		InputStreamReader isr2 = new InputStreamReader(new FileInputStream("osw.txt"),"utf-8");
				
		
		
		//一次读取一个字符
		/*int ch;
		while((ch = isr.read())!=-1){
			System.out.println((char)ch);
		}*/
		
		
		//一次读取一个字符数组
		char[] chs = new char[8];
		int len;
		while((len = isr2.read(chs))!=-1){
			System.out.print(new String(chs, 0, len));
		}
		
		isr.close();
	}

}
