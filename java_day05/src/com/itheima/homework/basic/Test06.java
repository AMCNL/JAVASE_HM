package com.itheima.homework.basic;



/*
 * 定义一个方法，查找指定数字在数组中出现的位置(若出现多次，多次打印)
       如: 数组[1232]要查找的数是2 则方法内部会打印索引值 1 ,3 
       数组[1232] 要查找的数是5 则方法每部会打印 “数组中没有这个数字”
 */
public class Test06 {

	public static void main(String[] args) {
          int[] arr = {1,2,3,4,5,6,6,6};
          
          //调用方法并传递参数
          adress(arr,6);
		
	}
	
	
	/*
	 * 查找指定数字在数组中出现的位置(若出现多次，多次打印)
	 * 返回值类型：void
	 * 参数列表：int[] arr,int n
	 */
	public static void adress(int[] arr,int n){
		int count = 0;
		//遍历数组，确定数组下标索引
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == n){
				System.out.println(i);
				count++;
			}
			
		}
		if(count==0){
			System.out.println("数组中没有这个数字!");
		}
		
		
	}
    
}
