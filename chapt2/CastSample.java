/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-10-14
 * 2.8 强制类型转换
 */

package cn.sdu.edu.sc.java.chapt2;

public class CastSample {

	public static void main(String[] args) {

		float fNumber = (float) 7.0;
		long lNumber = (long) 7;

		fNumber = lNumber;// 可以实现，自动类型转换
		System.out.println("1: fNumber is " + fNumber);

		/* 越界不会报错，但是很有可能是逻辑错误 */
		int iNumber2 = 100000;
		byte bNumber = (byte) iNumber2;
		System.out.println("2: bNumber is " + bNumber);

		/* 判断越界范围，是一个很好的做饭 */
		if (iNumber2 <= Byte.MAX_VALUE) {
			bNumber = (byte) iNumber2;
			System.out.println("3: bNumber is " + bNumber);
		} else
			System.out.println("Out of Scope");
	}

}
