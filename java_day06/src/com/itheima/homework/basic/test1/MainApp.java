package com.itheima.homework.basic.test1;

public class MainApp {
	public static void main(String[] args) {
		//��������,���ҳ�ʼ��
		//��ʦ���	����	�Ա�	����	��Ŀ
		System.out.println("��ʦ���\t����\t�Ա�\t����\t��Ŀ");

		Teacher ch1 = new Teacher("t0001","Ѧ֮ǫ","��",26,"java");
		
		System.out.println(ch1.getNumId()+"\t"+ch1.getName()+"\t"+ch1.getSex()+"\t"+ch1.getAge()+"\t"+ch1.getCourse());
		
		Teacher ch2 = new Teacher("t0002","�ű̳�","Ů",24,"IOS");
		
		System.out.println(ch2.getNumId()+"\t"+ch2.getName()+"\t"+ch2.getSex()+"\t"+ch2.getAge()+"\t"+ch2.getCourse());

		
		Teacher ch3 = new Teacher("t0003","�Ž�","��",28,"java");
		
		System.out.println(ch3.getNumId()+"\t"+ch3.getName()+"\t"+ch3.getSex()+"\t"+ch3.getAge()+"\t"+ch3.getCourse());

		System.out.println("-------------------------------------");
		/*
		 * �γ̱��	����	����ʱ��	�γ�����
		 */
		System.out.println("�γ̱��\t����\t����ʱ��\t\t�γ�����");
		
		Course co1 = new Course("s001","java","2007-02-08","Javaѧ�ƣ�����JavaSE��JavaEE");
		System.out.println(co1.getCourseId()+"\t"+co1.getCname()+"\t"+co1.getCtime()+"\t"+co1.getCdescribe());
		
		Course co2 = new Course("s002","IOS","2007-02-09","IOSϵͳ����");
		System.out.println(co2.getCourseId()+"\t"+co2.getCname()+"\t"+co2.getCtime()+"\t"+co2.getCdescribe());

	}

}
