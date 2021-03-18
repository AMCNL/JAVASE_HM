package com.itheima.myHomework.high_test01;

public class StudentTool extends Student {
	
	

	public StudentTool() {
		super();
		
	}

	public StudentTool(String name, int age, int score) {
		super(name, age, score);
		
	}

	@Override
	public void eat() {
		System.out.println(this.getName() + "正在吃饭");

	}

	@Override
	public void study(String content) {
		System.out.println(this.getName() + "正在学习" + content);
	}

	// public void listStudents(Student[] arr):遍历打印学生信息
	public void listStudents(Student[] arr) {
		System.out.println(this.getName() + "," + this.getAge() + "," + this.getScore());
	}

	// public int getMaxScore(Student[] arr):获取学生成绩的最高分
	public int getMaxScore(Student[] arr) {
		int max = arr[0].getScore();

		for (int i = 0; i < arr.length; i++) {

			if (arr[i].getScore() > arr[0].getScore()) {
				max = arr[i].getScore();
			}

		}

		return max;
	}

	// public Student getMaxStudent(Student[] arr):获取成绩最高的学员
	public Student getMaxStudent(Student[] arr) {

		int max = getMaxScore(arr);
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getScore() == max) {
				count = i;
			}
		}

		// Student s = arr[count];
		// return s;
		return arr[count];
	}

	// public int getAverageScore(Student[] arr):获取学生成绩的平均值
	public int getAverageScore(Student[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].getScore();
		}

		int avg = sum / arr.length;

		return avg;
	}

	// public int getCount(Student[] arr):获取不及格的学员数量
	public int getCount(Student[] arr) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getScore() < 60) {
				count++;
			}
		}

		return count;
	}

}
