package com.itheima.oop_4;

public class Student {

	private String name;

	private int hight;

	
	// ���췽��
	public Student() {

	}

	public Student(String name) {
      System.out.println(name+"----"+hight);
	}
	
	public Student(int hight) {
	      System.out.println(name+"----"+hight);
		}

	public Student(String name,int hight) {
		System.out.println(name+"----"+hight);
	}
	
	
	/*
	 * ��װ����
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	public int getHight() {
		return hight;
	}


}
