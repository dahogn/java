/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-10-11
 * 2.1 整数数据类型
 */
package cn.sdu.edu.sc.java.chapt2;

public class IntPrimitive {

	public static void main(String[] args) {

		/* Primitive类型，int、long、short、byte一定是小写 */
		/* 整数默认都是int */
		int iNumber = 7;// 32bit
		long lNumber = 7L;// 64bit
		//iNumber = 7777777777; //越界
		lNumber = 7777777777L; // 必须最后有"L"
		System.out.println("1: lNumber is " + lNumber);
		short sNumber = 7;// 16bit
		byte bNumber = 7;// 8bit
		// bNumber = 777;//越界
		Byte oNumber = 7;// 非原生数据类型（Non-Primitive)

	}

}
