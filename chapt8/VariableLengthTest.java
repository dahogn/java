/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-11-25 
 * 8.3 说明可变长度形参列表的使用方法
 *  
 *  */
package cn.sdu.edu.sc.java.chapt8;

public class VariableLengthTest {
	public double average(int... list) {
		double result = 0.0;
		if (list.length != 0) {
			int sum = 0;
			for (int num : list)
				sum += num;
			result = (double) sum / list.length;
		}
		return result;
	}

	public static void main(String[] args) {
		VariableLengthTest vlt = new VariableLengthTest();
		double average1 = vlt.average(3, 4, 6, 8);
		System.out.println("Average is " + average1);
	}
}
