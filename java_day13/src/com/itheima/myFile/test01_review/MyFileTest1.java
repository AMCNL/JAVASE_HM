package com.itheima.myFile.test01_review;
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
		
		File f1 = new File("e:\\aa\\a.txt");
		
		File f2 = new File("e:\\aa","a.txt");
		
		
		File f3 = new File("e:\\aa");
		File f4 = new File(f3,"a.txt");
		
		//以上f1，f2，f4做的是同一种方式，都是把"e:\\aa\\a.txt"转换为一个File对象
		
		
		
		
	}

}
