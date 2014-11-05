/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-10-11
 * 2.3 整数的除法
 */
package cn.sdu.edu.sc.java.chapt2;

public class IntDiv {

	public static void main(String[] args) {

		/* 结果的符号与运算一致；余数的符号与被除数一致 */
		int iNumber1 = 7, iNumber2 = 17;
		int iNumber3 = iNumber2 / iNumber1;
		int iNumber4 = iNumber2 % iNumber1;// 取余数
		System.out.println("1: iNumber3 is " + iNumber3 + "; iNumber4 is "
				+ iNumber4);

		iNumber1 = 7;
		iNumber2 = -17;
		iNumber3 = iNumber2 / iNumber1;
		iNumber4 = iNumber2 % iNumber1;
		System.out.println("2: iNumber3 is " + iNumber3 + "; iNumber4 is "
				+ iNumber4);

		/* 不一定 “结果乘以除数再加上余数，一定等于被除数” */
		iNumber1 = -7;
		iNumber2 = 17;
		iNumber3 = iNumber2 / iNumber1;
		iNumber4 = iNumber2 % iNumber1;
		System.out.println("3: iNumber3 is " + iNumber3 + "; iNumber4 is "
				+ iNumber4);

		iNumber1 = -7;
		iNumber2 = -17;
		iNumber3 = iNumber2 / iNumber1;
		iNumber4 = iNumber2 % iNumber1;
		System.out.println("4: iNumber3 is " + iNumber3 + "; iNumber4 is "
				+ iNumber4);
	}

}
