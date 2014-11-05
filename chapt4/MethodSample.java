/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-10-14
 * 4.2 方法的定义和概念
 */
package cn.sdu.edu.sc.java.chapt4;

public class MethodSample {

	/**
	 * 整数加法运算，返回数据类型为int
	 * 
	 * @param iNumber1
	 *            一个加数
	 * @param iNumber2
	 *            一个加数
	 * @return 加法运算的结果，数据类型为int
	 */
	public static int addition(int iNumber1, int iNumber2) {
		int iNumber3 = iNumber2 + iNumber1;
		iNumber2 += 100;
		iNumber1 += 10000;
		System.out.println("addition: iNumber1 is " + iNumber1);
		System.out.println("addition: iNumber2 is " + iNumber2);
		System.out.println("addition: iNumber3 is " + iNumber3);
		// dNumber1=35.0;//不在作用域内
		return iNumber3;
	}

	public static int sub(int iNumber1, int iNumber2) {
		return (iNumber2 - iNumber1);
	}

	/**
	 * 
	 * @param iNumber1
	 * @param iNumber2
	 * @return 注意越界，很关键
	 */

	public static int mult(int iNumber1, int iNumber2) {
		long temp = (long) iNumber1 * (long) iNumber2;
		// long temp = iNumber1 * iNumber2;//乘法默认返回int，很容易越界
		if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE) {
			System.out.println("Out of Scope!!");
			return 0;
		} else
			return (int) temp;
	}

	/**
	 * 进行控制台输出,方法可以没有返回值
	 * 
	 * @param str
	 *            输入字符串
	 */
	public static void print(String str) {
		System.out.println(str);
	
	}

	public static void main(String[] args) {
		int iNumber1 = 10, iNumber2 = 20;
		double dNumber1 = 10.0, dNumber2 = 20.0;
		int iNumber3 = addition(iNumber1, 20);
		// double dNumber3 = addition(dNumber2,dNumber1);// 数据类型不匹配，报错

		/* 可以不用返回值 */
		mult(Integer.MAX_VALUE, Integer.MAX_VALUE);

		/* 局部变量的作用域仅限于本方法内部 */
		System.out.println("main: iNumber1 is " + iNumber1);
		System.out.println("main: iNumber2 is " + iNumber2);
		System.out.println("main: iNumber3 is " + iNumber3);

		/* 方法调用可以嵌套 */
		print("main: result is " + sub(iNumber2, iNumber1));
	}
}
