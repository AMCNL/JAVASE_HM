package com.itheima.homework.high.test2;

/*
 * �����������󣬲��ô���ʵ��
	1.��ʦ��Teacher
		����:
			����name
			����age
			��������content
		��Ϊ:
			�Է�
			����
	2.ѧ����Student
		����:
			����name
			����age
			ѧϰ����content
		��Ϊ:
			�Է�eat()
			ѧϰstudy()
			
				Ҫ��:
1.��������Ҫ����Teacher���Student��,����Ҫ˽��,���ɿղΡ��вι��죬setter��getter����
2.���������,��main�����д�������Ķ��󲢸����Ը�ֵ(��ʾ���ַ���:setter�����͹��췽��)
3.���ó�Ա����,��ӡ��ʽ����:
	����Ϊ30����־����ʦ���ڳԷ�....
	����Ϊ30����־����ʦ���ڿ��ܵĽ���Java��������������֪ʶ........("Java�������������"������ʦ���ε�����)	
	����Ϊ18�ĺ���ͬѧ���ڳԷ�....			
	����Ϊ18�ĺ���ͬѧ����ר����־��������������֪ʶ....("�������"����ѧ��ѧϰ������)
 */
public class Student {
	private String name;

	private int age;

	private String content;

	public void eat() {
		System.out.println("����Ϊ" + age + "��" + name + "ͬѧ���ڳԷ�....");
	}

	public void study() {
		System.out.println("����Ϊ" + age + "��" + name + "ͬѧ����ר����־������" + content);
	}

	public Student(String name, int age, String content) {
		super();
		this.name = name;
		this.age = age;
		this.content = content;
	}

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
