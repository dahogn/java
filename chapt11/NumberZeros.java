package cn.sdu.edu.sc.java.chapt11;

import java.util.Scanner;

/**
 * 计算数字里面零的个数，说明递归的使用方法
 * 
 * @author Dahogn
 * @version 1.01
 * @since 2008.11.25
 */
public class NumberZeros {
	public static void main(String[] args) {

		System.out.println("Enter a nonnegative number:");

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println(number + " contains " + numberOfZeros(number)
				+ " zeros.");
		scan.close();
	}

	/**
	 * Precondition: n >= 0 Returns the number of zero digits in n.
	 */

	public static int numberOfZeros(int n) {
		int temp = 0;
		if (n == 0)
			return 1;
		else if (n < 10)// and not 0
			return 0;// 0 for no zeros
		else if (n % 10 == 0) {
			temp = numberOfZeros(n / 10) + 1;
			return temp;
		} else
			temp = numberOfZeros(n / 10);
		return temp;
	}
}
