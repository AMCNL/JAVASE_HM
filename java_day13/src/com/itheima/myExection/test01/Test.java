package com.itheima.myExection.test01;
/*
 * 需求: 编写一段代码, 要求代码中会产生索引越界异常		并使用try...catch进行处理
	分析:
	第一步:定义数组
	第二步:在打印语句中访问不存在的索引
	第三步:将可能发生问题的代码用try包裹
	第四步:catch中捕获IndexOutOfBoundsException
	第五步:对异常进行处理,并用printStackTrace打印出异常信息

 */
public class Test {
	public static void main(String[] args) {
		//第一步:定义数组
		int[] arr = {1,2,3,4,5};
		
		
		//第三步:将可能发生问题的代码用try包裹
		try {
			//第二步:在打印语句中访问不存在的索引
			System.out.println(arr[10]);
		} catch (ArrayIndexOutOfBoundsException e) {//第四步:catch中捕获IndexOutOfBoundsException
			
			e.printStackTrace();
		}
		
	}

}
