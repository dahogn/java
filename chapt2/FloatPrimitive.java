/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-10-11
 * 2.4 浮点数数据类型
 */
package cn.sdu.edu.sc.java.chapt2;

public class FloatPrimitive {

	public static void main(String[] args) {

		/* 浮点数据默认是double类型 */
		double dNumber = 7.0; // 64bit
		System.out.println("1: dNumber is " + dNumber);
		float fNumber = 7.0f;// 32bit
		System.out.println("2: fNumber is " + fNumber);

		/* 浮点数是不精准的 */
		double dNumber1 = 2.0;
		double dNumber2 = 1.1;
		dNumber1 -= dNumber2;
		System.out.println("3.The Value of dNumber1 is " + dNumber1);

		float fNumber1 = 2.0f;
		float fNumber2 = 1.2f;
		fNumber1 -= fNumber2;
		System.out.println("4.The Value of fNumber1 is " + fNumber1);

	}

}
