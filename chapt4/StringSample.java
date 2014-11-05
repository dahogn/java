/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-10-14
 * 4.1 字符串的基础知识
 */

package cn.sdu.edu.sc.java.chapt4;

public class StringSample {

	public static void main(String[] args) {

		/* String不是基本数据类型,但是可以用"+" */
		String str1 = "Hello";
		String str2 = "World";
		String str3 = str1 + str2;// 不能用"-"
		System.out.println("1: str3 is " + str3);

		int str3_l = str3.length();
		System.out.println("length of str3 is " + str3_l);

		/* 注意从0开始计数，第一个字符为0 */
		char ch = str3.charAt(1);
		System.out.println("the SECOND char is " + ch);

		/* 注意 + 的运算次序 */
		System.out.println(100 + 10000 + "Hello" + 100 + 10000);

		str3 = "" + 100;// 最简单的转化成字符串的技巧
		System.out.println("2: str3 is " + str3);

	}

}
