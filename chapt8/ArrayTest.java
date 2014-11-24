/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-11-25 
 * 8.1 说明数组的基本使用方法
 *  
 *  */
package cn.sdu.edu.sc.java.chapt8;

public class ArrayTest {
	public static final int ArrayLength = 10;// 避免魔数（Magic Number）的有效方法

	public static void Output(int[] intArray) {
		for (int index = 0; index < intArray.length; index++)
			System.out.print(intArray[index] + ",");
		System.out.println();
	}

	public static void swap(int[] intarr) {
		int temp = intarr[0];
		intarr[0] = intarr[1];
		intarr[1] = temp;
	}

	public static void main(String[] args) {

		int[] intArray = new int[ArrayTest.ArrayLength];// 定义一个数组
		for (int index = 0; index < intArray.length; index++)
			intArray[index] = index * index;
		ArrayTest.Output(intArray);
		System.out.println("--------------------------------------");
		int[] testarr = { 14, 25 };// 可以在声明数组的同时进行初始化
		/*
		 * 不能分开，分开写则会出错
		 */
		/*
		 * int[] testarr; testarr= { 14, 25 };
		 */
		ArrayTest.swap(testarr);
		ArrayTest.Output(testarr);// 此时可以完成数组里面两个元素的交换

	}

}
