/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-10-19
 * 3.3 循环语句的用法
 */

package cn.sdu.edu.sc.java.chapt3;

public class Loop {

	public static void main(String[] args) {
		int iNumber1 = 10, count = 0;
		// 计算10加到19
		while (iNumber1 < 20) {
			count += iNumber1;
			iNumber1++;
		}
		System.out.println("1.The Value of count is " + count
				+ "; The Value of iNumber1 is " + iNumber1);

		iNumber1 = 10;
		count = 0;
		do {
			iNumber1++;
			count += iNumber1;
		} while (iNumber1 < 20);
		System.out.println("2.The Value of count is " + count
				+ "; The Value of iNumber1 is " + iNumber1);

		iNumber1 = 10;
		count = 0;
		do {
			count += iNumber1;
			iNumber1++;
		} while (iNumber1 < 10);
		System.out.println("3.The Value of count is " + count
				+ "; The Value of iNumber1 is " + iNumber1);

		iNumber1 = 10;
		count = 0;
		while (iNumber1 < 10) {
			count += iNumber1;
			iNumber1++;
		}
		System.out.println("4.The Value of count is " + count
				+ "; The Value of iNumber1 is " + iNumber1);

		iNumber1 = 10;
		count = 0;
		for (; iNumber1 < 20;) {
			count += iNumber1;
			iNumber1++;
		}
		System.out.println("5.The Value of count is " + count
				+ "; The Value of iNumber1 is " + iNumber1);

		for (iNumber1 = 10, count = 0; iNumber1 < 20; count += iNumber1, iNumber1++)
			;
		System.out.println("6.The Value of count is " + count
				+ "; The Value of iNumber1 is " + iNumber1);

		/*
		 * 注意作用域 for(int
		 * iNumber2=10,count2=0;iNumber1<20;count2+=iNumber2,iNumber2++);
		 * System.out.println("7.The Value of count2 is "+count2+
		 * "; The Value of iNumber2 is "+iNumber2);
		 */

		iNumber1 = 10;
		count = 0;
		do {
			count += iNumber1;
			iNumber1++;
			if (iNumber1 == 20)
				break;// 只能终止一层循环
		} while (true);
		System.out.println("7.The Value of count is " + count
				+ "; The Value of iNumber1 is " + iNumber1);

		iNumber1 = 10;
		count = 0;
		for (;;) {

			count += iNumber1;
			iNumber1++;
			if (iNumber1 == 20)
				break;
		}
		System.out.println("8.The Value of count is " + count
				+ "; The Value of iNumber1 is " + iNumber1);

		// continue
		iNumber1 = 10;
		do {
			iNumber1++;
			if (iNumber1 % 2 == 0) {
				System.out.println("9.The Value of iNumber1 is " + iNumber1);
				continue;
			}
			System.out.println("10.The Value of iNumber1 is " + iNumber1);
		} while (iNumber1 < 20);

		for (iNumber1 = 2, count = 0; iNumber1 < 10; iNumber1++) {
			System.out.println("11.The Value of iNumber1 is " + iNumber1);
			count += iNumber1;
			System.out.println("12.The Value of count is " + count
					+ "; The Value of iNumber1 is " + iNumber1);
		}
		System.out.println("13.The Value of count is " + count
				+ "; The Value of iNumber1 is " + iNumber1);

	}

}
