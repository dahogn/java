/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-10-19 
 * 5.1 说明final的用法
 *  final修饰变量，表明这个变量只能被赋值1次，赋值后将不能被改变，不是用来声明常量！
 * 
 *  */

package cn.sdu.edu.sc.java.chapt5;

import cn.sdu.edu.sc.java.chapt4.Rectangle;

public class FinalSample {

	private final int VALUE_A = 10;// VALUE_A的值将不能被改变

	public static final int VALUE_B = 10;// 相当于定义了一个常量

	private final Rectangle rect = new Rectangle(10, 20);

	/* 可以将属性声明为final而且不赋初始值，那么构造方法必须对此属性进行赋值 */
	private final int VALUE_C;

	/* 不会有Setter方法 */
	public int getVALUE_C() {
		return VALUE_C;
	}
	
	FinalSample(int c) {
		VALUE_C = c;
	}

	public void test() {
		// VALUE_A = 100;//不能改变
		// rect=new Rectangle(100, 200);//不能改变

		/* 改变指向对象的值是可以的 */
		rect.setLength(100);
		rect.setWidth(200);
	}

	/* 形参定义为final，方法内部不能改变此形参的值 */
	public void testFinal(final int iNumber) {
		// iNumber++;//错误
	}

	public static void main(String[] args) {
		System.out.println("VALUE_B is " + FinalSample.VALUE_B);// 可以直接使用

		FinalSample fs = new FinalSample(20);
		System.out.println("VALUE_C is " + fs.getVALUE_C());

	}

}
