package com.itheima.myArraySort_review;
/*
 * 冒泡排序：
		需求:数组排序：(冒泡排序)
		分析:
		第一步:定义数组int[] arr = {24,69,80,57,13};
		第二步:对数组遍历,同时对其进行排序
		第三步:打印遍历后的数组元素

 */
public class SortDemo {

	public static void main(String[] args) {
		
		
		int[] arr = {9,8,5,12,3};
		
		sort(arr);
		
		
		printArray(arr);
		
		
	}
	
	
	public static void printArray(int[] arr){
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if(i == arr.length-1){
				System.out.print(arr[i]);
			}else{
				System.out.print(arr[i]+", ");
			}
		}
		System.out.println("]");
	}
	
	/*
	 * 分析：冒泡排序方法
	 *  两个明确：返回值类型  void    （因为数组为引用类型,形参就可以更改数组实际的值）
	 *          参数列表  ：int[] arr
	 * 
	 */
	
	public static void sort(int[] arr){
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]){
					
					int temp = arr[j];
					
					arr[j] = arr[j+1];
					
					arr[j+1] = temp;
					
				}
			}
		}
	}

}
