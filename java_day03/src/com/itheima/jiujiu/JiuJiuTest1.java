package com.itheima.jiujiu;
/*
 * ¾Å¾Å³Ë·¨±í°¸Àý
 */
public class JiuJiuTest1 {
	
	public static void main(String[] args) {
	 
		for(int i=0;i<=90;i++){
			System.out.print("-");
		}
		System.out.println();
	   for(int i=1;i<=9;i++){
		   for(int j=1;j<=i;j++){
			   if(i*j<10){
				   if(j==1){
					   System.out.print("| "+j+"*"+i+"="+"0"+j*i+"\t"); 
				   }else{
					   System.out.print(""+j+"*"+i+"="+"0"+j*i+"\t");
				   }
				  
			   }else{
				  
				  System.out.print(j+"*"+i+"="+j*i+"\t");
			   }
		   }
		   System.out.println();
	   }
	   for(int i=0;i<=90;i++){
			System.out.print("-");
		}
	}

}
