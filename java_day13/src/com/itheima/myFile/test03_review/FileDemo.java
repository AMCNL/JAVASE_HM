package com.itheima.myFile.test03_review;

import java.io.File;
import java.io.IOException;

/*
 * 需求：练习File类的删除功能(使用相对路径)
	分析：
	第一步:用创建方法在当前项目下准备文件和文件夹
	第二步:将创建好的文件或文件夹封装成file对象
	第三步:调用delete方法删除

 */

public class FileDemo {
	public static void main(String[] args) throws IOException {
	
       File f1 = new File("aa");
       
      // System.out.println("mkdir:"+f1.mkdir());
       
       
       File f2 = new File("aa\\a.txt");
       //System.out.println("createNewFile:"+f2.createNewFile());
       
       File f3 = new File("aa.txt");
      //System.out.println("createNewFile:"+f3.createNewFile());
       
		
       //删除操作
       System.out.println("delete:"+f3.delete());
       
       System.out.println("delete:"+f2.delete());//不可以级联删除
       
       System.out.println("delete:"+f1.delete());
	}

}
