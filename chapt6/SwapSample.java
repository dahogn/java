/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-11-6 
 * 5.3 通过swap，说明方法参数传递的“传值”特点
 *  Java里面方法传递，全部是传值实现
 *  */

package cn.sdu.edu.sc.java.chapt5;

class Int {
	public int in;// 内部只有一个int类型的变量，为了使用方便，声明为public，不是好的方法

	public Int(int in) {
		this.in = in;
	}

}

public class SwapSample {

	/* 用Primitive变量作为形参，传值，无法完成swap */
	public static void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
		System.out.println("swap int: i is " + i);
		System.out.println("swap int: j is " + j);

	}

	/* 用自定义的Int类，传引用的地址值，可以完成swap */
	public static void swap(Int oi, Int oj) {
		int temp = oi.in;
		oi.in = oj.in;
		oj.in = temp;

		/* 以下代码一样不能完成swap */
		/*
		 * Int otemp=oi; oi=oj; oj=otemp;
		 */
		System.out.println("swap Int: oi.in is " + oi.in);
		System.out.println("swap Int: oj.in is " + oj.in);

	}

	public static void swap(Integer wi, Integer wj) {
		Integer otemp = wi;
		wi = wj;
		wj = otemp;

		System.out.println("swap Integer: wi is " + wi);
		System.out.println("swap Integer: wj is " + wj);
	}

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		swap(i, j);
		System.out.println("1 main: i is " + i);
		System.out.println("1 main: j is " + j);
		System.out.println("--------------------------------");

		Int oi = new Int(10);
		Int oj = new Int(20);
		swap(oi, oj);
		System.out.println("2 main: oi.in is " + oi.in);
		System.out.println("2 main: oj.in is " + oj.in);
		System.out.println("--------------------------------");

		Integer wi = 10;
		Integer wj = 20;
		swap(wi, wj);
		System.out.println("3 main: wi is " + wi);
		System.out.println("3 main: wj is " + wj);
		System.out.println("--------------------------------");

	}

}
