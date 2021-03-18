package com.itheima.homework.hight;

/*
 * 主方法中给定数组int[] arr= {10,20,30,40,50,60};这个数组没有重复元素.
 * 定义一个方法可以接受这个给定的数组并返回这个数组中最大元素值的索引值
 */
public class Test01 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60};
		
		int num=showIndex(arr);
		System.out.println(num);
		
		
	}
	
	/*
	 * 返回值类型 int index
	 * 参数列表：int[] arr
	 */
	public static int showIndex(int[] arr){
		int max = arr[0];
		
		//解决最大值
		for (int i = 0; i < arr.length; i++) {
		     if(arr[i]>max){
		    	 max = arr[i]; 
		     }	
		}
		
		//判断最大值索引
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == max){
				return i;
			}
		}
		
		return 0;
		
	}

}
