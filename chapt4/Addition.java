/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-10-19 
 * 4.3 说明方法的Overwriting（重写）
 * 程序没有判断是否会越界，都不是好的程序
 */
package cn.sdu.edu.sc.java.chapt4;

public class Addition {
	public int Add(int number1, int number2) {
		System.out.println("Use int");
		return (number1 + number2);
	}

	public int Add(int number1, int number2, int number3) {
		System.out.println("Use int 3");
		return this.Add(Add(number1, number2), number3);
	}

	public double Add(double number1, double number2) {
		System.out.println("Use double");
		return (number1 + number2);
	}

	public float Add(float number1, float number2) {
		System.out.println("Use float");
		return (number1 + number2);
	}

	/* 形参列表相同而返回值不同，不行 */
//	public double Add(float number1, float number2) {
//		System.out.println("Use float2");
//		return (double) (number1 + number2);
//	}

	public short Add(short number1, short number2) {
		System.out.println("Use short");
		return (short) (number1 + number2);// 默认返回int，必须强制类型转化
	}

	public int Add(int number1, short number2) {
		System.out.println("Use int and short");
		return (number1 + number2);
	}

	public int Add(short number1, int number2) {
		System.out.println("Use short and int");
		return (number1 + number2);
	}

	public static void main(String[] args) {
		Addition add = new Addition();
		/* 注意会越界 */
		System.out.println(add.Add(Integer.MAX_VALUE, Integer.MAX_VALUE));

		/* 以下两个调用不同的方法 */
		add.Add(4, 5);
		add.Add(4, 5, 6);

		/* 以下两个调用不同的方法 */
		add.Add(4.5, 5.3);
		add.Add(4.5f, 5.3f);

		/* 以下三个调用不同的方法 */
		int iNumber = 10;
		short sNumber = 20;
		add.Add(iNumber, sNumber);
		add.Add(sNumber, iNumber);
		add.Add(sNumber, sNumber);
	}

}
