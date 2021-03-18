package com.itheima.homework.basic.test1;

/*
 * 教师编号	姓名	性别	年龄	科目
 */
public class Teacher {
	private String numId;
	
	private String name;

	private String sex;

	private int age;

	private String course;

	public Teacher(String numId, String name, String sex, int age, String course) {
		
		this.numId = numId;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.course = course;
	}

	public Teacher() {
		
	}

	public String getNumId() {
		return numId;
	}

	public void setNumId(String numId) {
		this.numId = numId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	
	
	
	

}
