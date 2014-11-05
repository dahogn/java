/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-10-14
 * 2.6 字符的使用和概念
 */

package cn.sdu.edu.sc.java.chapt2;

public class CharSample {

	public static void main(String[] args) {

		/* Unicode 16bit */
		char ch1 = 'a';// 单引号表示，不是双引号
		// char ch1="a";//语法错误
		System.out.println("1: ch1 is " + ch1);

		char ch2 = 97;
		System.out.println("2: ch2 is " + ch2);

		byte bNumber = 97;
		char ch3 = (char) bNumber;// 必须强制类型转换
		System.out.println("3: ch3 is " + ch3);
	
		/* 牢记转义字符 */
		ch1 = '\''; // 必须强制类型转换
		System.out.println("4: ch1 is " + ch1);

		/* \t \n \r 用来排版 */
		System.out.println("5: 1\t 2\t 3\t");
		System.out.println("5: 10\t 20\t 30\t");
		System.out.println("5: 100\t 200\t 300\t");
		
		/* Unicode，中文字符也可以 */
		char ch4 = '中';
		System.out.println("6: ch4 is " + ch4);

		/*可以这也使用，强烈不推荐 */
		char 字符 = '中';
		System.out.println("7: 字符 is " + 字符);
	}

}
