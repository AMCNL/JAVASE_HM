package com.itheima.homework.high.test1;
/*
 * ������
 */
public class Test {

	public static void main(String[] args) {
		//����Manager���󣬲���ʼ��
		Manager m = new Manager("���»�","1001",5000.0,6000.0);
		/*
		 * get/set��ʽ��ֵ
		 */
		/*
		m.setId("1001");
		m.setSalary(5000.0);
		m.setBonus(60000.0);
		m.work();
		*/
		
		//����Manager���󣬲���ʼ��
		Coder c = new Coder("����","2001",3000.0);
		
		/*
		 * get/set��ʽ��ֵ
		 */
		/*
		c.getName("cl");
		c.getId("2001");
		c.setSalary(3500.0);
		*/
		c.work();
		
		

	}

}
