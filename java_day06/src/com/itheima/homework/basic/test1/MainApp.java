package com.itheima.homework.basic.test1;

public class MainApp {
	public static void main(String[] args) {
		//创建对象,并且初始化
		//教师编号	姓名	性别	年龄	科目
		System.out.println("教师编号\t姓名\t性别\t年龄\t科目");

		Teacher ch1 = new Teacher("t0001","薛之谦","男",26,"java");
		
		System.out.println(ch1.getNumId()+"\t"+ch1.getName()+"\t"+ch1.getSex()+"\t"+ch1.getAge()+"\t"+ch1.getCourse());
		
		Teacher ch2 = new Teacher("t0002","张碧晨","女",24,"IOS");
		
		System.out.println(ch2.getNumId()+"\t"+ch2.getName()+"\t"+ch2.getSex()+"\t"+ch2.getAge()+"\t"+ch2.getCourse());

		
		Teacher ch3 = new Teacher("t0003","张杰","男",28,"java");
		
		System.out.println(ch3.getNumId()+"\t"+ch3.getName()+"\t"+ch3.getSex()+"\t"+ch3.getAge()+"\t"+ch3.getCourse());

		System.out.println("-------------------------------------");
		/*
		 * 课程编号	名称	创建时间	课程描述
		 */
		System.out.println("课程编号\t名称\t创建时间\t\t课程描述");
		
		Course co1 = new Course("s001","java","2007-02-08","Java学科，包含JavaSE和JavaEE");
		System.out.println(co1.getCourseId()+"\t"+co1.getCname()+"\t"+co1.getCtime()+"\t"+co1.getCdescribe());
		
		Course co2 = new Course("s002","IOS","2007-02-09","IOS系统开发");
		System.out.println(co2.getCourseId()+"\t"+co2.getCname()+"\t"+co2.getCtime()+"\t"+co2.getCdescribe());

	}

}
