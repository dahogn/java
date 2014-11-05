/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-10-11
 * 2.2 整数基本数学运算
 */
package cn.sdu.edu.sc.java.chapt2;

public class IntMath {

	public static void main(String[] args) {

		/* 整数的加减乘除简写 */
		int iNumber1 = 7, iNumber2 = 17;
		iNumber1 += iNumber2;
		// iNumber1 = iNumber1 + iNumber2; 与上面的表达式等价
		System.out.println("1: iNumber1 is " + iNumber1 + "; iNumber2 is "
				+ iNumber2);

		iNumber1 = 7;
		iNumber2 = 17;
		iNumber1 -= iNumber2;// iNumber1 = iNumber1-iNumber2;
		System.out.println("2: iNumber1 is " + iNumber1);

		iNumber1 = 8;
		iNumber2 = 4;
		iNumber1 /= iNumber2;// iNumber1 = iNumber1/iNumber2;
		System.out.println("3: iNumber1 is " + iNumber1);

		/* ++和--的次序 */
		iNumber1 = 8;
		iNumber1++;
		System.out.println("4: iNumber1 is " + iNumber1);

		++iNumber1;// 与iNumber1++;等价
		System.out.println("5: iNumber1 is " + iNumber1);

		iNumber1 = 8;
		iNumber2 = iNumber1++; // 先将iNumber2 = iNumber1，再iNumber1=iNumber1+1
		System.out.println("6: iNumber1 is " + iNumber1 + "; iNumber2 is "
				+ iNumber2);

		iNumber1 = 8;
		iNumber2 = ++iNumber1; // 先将iNumber1=iNumber1+1，再iNumber2 = iNumber1
		System.out.println("7: iNumber1 is " + iNumber1 + "; iNumber2 is "
				+ iNumber2);

	}

}
