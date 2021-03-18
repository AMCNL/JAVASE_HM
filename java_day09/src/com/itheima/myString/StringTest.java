package com.itheima.myString;
/*
 * 模拟用户登录案例（第二遍）：
 */

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		String username = "admin";
		String password = "admin";
		
		for (int i = 0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入用户名：");
			String name = sc.nextLine();
			System.out.println("请输入密码：");
			String pwd = sc.nextLine();
			
			if(username.equals(name) && password.equals(pwd)){
				System.out.println("登录成功");
				break;
			}else{
				if(2-i == 0){
					System.out.println("登录失败，您的账号被冻结，请及时与管理员联系");
				}else{
					System.out.println("登录失败，您还有"+(2-i)+"次机会");
				}
			}
		}
		
	}

}
