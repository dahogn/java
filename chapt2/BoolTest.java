/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-10-14
 * 2.7 bool的使用和概念
 */

package cn.sdu.edu.sc.java.chapt2;

public class BoolTest {

	public static void main(String[] args) {
		
		/* 全部小写 */
		boolean flag1=true;
		//flag1=1;//只能是true or false
		System.out.println("1: flag1 is " + flag1);
		boolean flag2=false;
		//boolean flag3=flag1+flag2;//不能加减乘除
		System.out.println("2: flag2 is " + flag2);
		
		int iNumber=0;
		//flag2=(boolean)iNumber;//不能强制类型转换
		
	}

}
