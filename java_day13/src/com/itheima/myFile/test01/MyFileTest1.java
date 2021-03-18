package com.itheima.myFile.test01;
/*
 * 需求:使用File类的三种构造方法将硬盘中的文件或文件夹, 封装成File对象.
	分析:
	第一步: File(String pathname)
	第二步: File(String parent, String child)
	第三步: File(File parent, String child)

 */
import java.io.File;

public class MyFileTest1 {
	public static void main(String[] args) {
		
		
		File f1 = new File("e:\\dsj\\315.txt");
		
		File f2= new File("e:\\dsj","315.txt");
		
		File f3 = new File("e:\\dsj");
		File f4 = new File(f3,"315.txt");
		
		//以上f1，f2，f4三种表达的是同样的事情，都是把e:\\dsj\\315.txt转换为了一个file对象
		
		
	}

}
