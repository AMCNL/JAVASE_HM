package com.itheima._homework.basic;

import java.util.Scanner;

/*
 * 需求：
		在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
		选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值。
		请写代码实现。(不考虑小数部分)
	
       思路：
        A:定义一个长度为6的数组
		B:评委打分的数据采用键盘录入实现
		C:写代码获取数组的最大值(最高分)
		D:写代码获取数组的最小值(最低分)
		E:写代码求数组中的元素和(总分)
		F:平均分：(总分-最高分-最低分)/(arr.length-2)
		G:输出平均分即可
		
 */
public class Test05 {

	public static void main(String[] args) {
		// 定义一个长度为6的数组
		int[] arr = new int[6];

		// 创建录入对象
		Scanner sc = new Scanner(System.in);

		// 循环给数组赋值
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请给第" + (i + 1) + "位选手打分：");
			arr[i] = sc.nextInt();
		}

		// 定义最大值参考变量max，并把数组索引值为0的的值赋值给max
		int max = arr[0];

		// 定义最大值参考变量min，并把数组索引值为0的的值赋值给min
		int min = arr[0];

		// 定义一个求和变量sum
		int sum = 0;

		// for循环遍历数组元素
		for (int i = 0; i < arr.length; i++) {
			// 解决max值
			if (arr[i] > max) {
				max = arr[i];
			}

			// 解决min值
			if (arr[i] < min) {
				min = arr[i];
			}

			// 求和
			sum += arr[i];
		} // for end

		// 定义平均数
		double vag = (double) (sum - max - min) / (arr.length - 2);

		// 输出打印
		System.out.println(max+","+min);
		System.out.println("该选手的最终得分为：" + vag);

	}

}
