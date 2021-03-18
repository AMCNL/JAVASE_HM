package com.itheima.myArraySort;
/*
 * 冒泡排序：
 */
public class SortDemo {

	public static void main(String[] args) {
		
		
		int[] arr = {9,8,5,12,3};
		
		
		
		/*System.out.println("第一次遍历");
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		printArray(arr);
		
		
		System.out.println("第二次遍历");
		for(int i=0;i<arr.length-1-1;i++){
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		printArray(arr);
		
		
		System.out.println("第三次遍历");
		for(int i=0;i<arr.length-1-1;i++){
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		printArray(arr);
		
		System.out.println("第四次遍历");
		for(int i=0;i<arr.length-1-1;i++){
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		printArray(arr);*/
		
		//嵌套循环解决
		/*for (int i = 0; i < arr.length-1; i++) {
			
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.println("第"+(i+1)+"次排序后：");
			printArray(arr);
		}*/
		
		//上面的还是不太好，优化用方法封装，可以实用多个数组
		
		//调用排序方法
		sort(arr);
		//打印
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
