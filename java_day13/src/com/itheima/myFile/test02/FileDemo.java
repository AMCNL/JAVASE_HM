package com.itheima.myFile.test02;
/*
 * boolean createNewFile()  创建文件
 * boolean mkdir()   创建文件夹
 * boolean mkdirs()  创建多级目录
 */
import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		
		
	    File f1 = new File("e:\\aa.txt");
	    System.out.println("f1.createNewFile:"+f1.createNewFile());
	    
	    File f2 = new File("e:\\aa");
	    System.out.println("mkdir:"+f2.mkdir());
	    
	    File f3 = new File("e:\\aa\\bb");
	    System.out.println("mkdirs:"+f3.mkdirs());
	    
	    
	    File f4 = new File("e:\\aa");
	    File f5 = new File("e:\\aa\\a.txt");
	    System.out.println("mkdir:"+f4.mkdir());
	    System.out.println("createNewFile:"+f5.createNewFile());
	    
	    
	    
	    
	    
	}

}
