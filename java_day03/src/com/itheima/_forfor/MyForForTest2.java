package com.itheima._forfor;
/**
 * 打印出：
*
**
***
****
*****
-----------------
    *
   **
  ***
 ****
*****
-----------------
*****
****
***
**
*
-----------------
*****
 ****
  ***
   **
    *
 * @author lynn
 *
 */
public class MyForForTest2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------------");

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				if (j <= 5 - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

				// System.out.print("*");
			}

			System.out.println();
		}

		System.out.println("-----------------");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		

		for (int i = 0; i <= 5; i++) {

			for (int j = 5; j >=1; j--) {

				if (j <= 5 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

				// System.out.print("*");
			}

			System.out.println();
		}
		
		
		System.out.println("-------第二种方式-------");
		

		for (int i = 5; i>=1; i--) {

			for (int j = 1; j <=5; j++) {

				if (j > 5 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

				// System.out.print("*");
			}

			System.out.println();
		}

	}

}
