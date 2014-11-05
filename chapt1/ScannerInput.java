/**
 * @author ´÷ºè¾ı@SDU
 * @version 1.0
 * @date 2012-09-28
 * 1.2
 */
package cn.sdu.edu.sc.java.chapt1;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		/*
		 * ÑİÊ¾ÃüÁîĞĞÊäÈë
		 */
		System.out.println("Please Input here: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println("Input is " + str);
		scan.close();
	}

}
