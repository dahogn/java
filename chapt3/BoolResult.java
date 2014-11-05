/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-10-18
 * 3.1 布尔运算的结果与短路效应
 */

package cn.sdu.edu.sc.java.chapt3;

public class BoolResult {
	public static void main(String[] args) {
		int a = 5;
		int b = -5;
		int c = 20;
		int d = -20;

		/*
		 * && 优先级高于 ||，即 && 先计算
		 */
		if ((b-- < -5) && (a++ < 5) || (c < 30)) {
			System.out.println("HERE FIRST");
		}
		System.out.println("FIRST a is " + a);
		System.out.println("FIRST b is " + b);

		/*
		 * 只要 || 左边的表达式值为true，则不计算右边的表达式的值，整个表达式值为true。
		 */
		a = 5;
		b = -5;
		if ((c < 30) || (b-- < -5) && (a++ < 5)) {
			System.out.println("HERE Second");
		}
		System.out.println("Second a is " + a);
		System.out.println("Second b is " + b);

		a = 5;
		b = -5;
		if ((c < 20) || (a++ < 5) && (b-- < -5) || (d++ < -10)) {
			System.out.println("HERE Third");
		}
		System.out.println("Third a is " + a);
		System.out.println("Third b is " + b);
		System.out.println("Third d is " + d);

		/*
		 * 运算符 && 左边的表达式值若为 false，则不用计算 && 右边的表达式的值，整个 && 表达式值为 false。
		 */
		a = 5;
		b = -5;
		if ((c < 20) && (b-- < -5) || (a++ < 15)) {
			System.out.println("HERE Fourth");
		}
		System.out.println("Fourth a is " + a);
		System.out.println("Fourth b is " + b);

		a = 5;
		b = -5;
		if ((c < 20) && (b-- < -5) && (a++ < 15)) {
			System.out.println("HERE Fifth");
		}
		System.out.println("Fifth a is " + a);
		System.out.println("Fifth b is " + b);

		a = 5;
		b = -5;
		d = -20;
		if ((c < 30) && (b-- < -5) && (a++ < 15) || (d++ < -10)) {
			System.out.println("HERE Sixth");
		}
		System.out.println("Sixth a is " + a);
		System.out.println("Sixth b is " + b);
		System.out.println("Sixth d is " + d);
	}

}
