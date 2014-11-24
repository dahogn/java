/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-11-25 
 * 8.2 说明命令行参数的使用方法
 *  
 *  */
package cn.sdu.edu.sc.java.chapt8;

public class ArgumentDemo {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++)
			System.out.println("args[" + i + "] is " + args[i]);
	}
}
