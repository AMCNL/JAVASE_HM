package com.itheima.myConversionStream04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 需求:把当前项目目录下的StringDemo.java内容复制到当前项目目录下的Copy.java
	分析:
	第一步: 创建字符输入流读取文件
	第二步: 创建字符输出流关联目标文件
	第三步: 自定义字符数组提高效率
	第四步: 不断的读写操作
	第五步: 关闭流释放资源

 */
public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		
		FileReader fr = new FileReader("LILI.jpg");
		
		//封装目的地
		FileWriter fw = new FileWriter("copy.jpg");
		
		char[] ch = new char[1024];
		int len;
		while((len = fr.read(ch))!=-1){
			fw.write(ch,0,len);
		}
		
		
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
		
		
		
		

	}

}
