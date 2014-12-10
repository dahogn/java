/**
 * @author Dahogn
 * @version 1.00
 * @since 2012.11.27
 * 9.1 说明Java的异常机制
 */

package cn.sdu.edu.sc.java.chapt9;

import java.util.Scanner;

public class ExceptionDemo {
	public static int div(int number, int div) throws DivideByZeroException
	// throws，有可能抛出异常，而在方法内没有被处理
	// 使用这样的方法，应该放在try{}里面
	{
		if (div == 0)
			throw new DivideByZeroException("除数不能为0");
		// 抛出异常后，将立刻中止此方法的执行
		else
			return number / div;
	}

	public static int sqrt(int number) throws SqrtExceedException
	// throws，有可能抛出异常，而在方法内没有被处理
	// 使用这样的方法，应该放在try{}里面
	{
		if (number > 46340)
			throw new SqrtExceedException("求平方数越界");
		// 抛出异常后，将立刻中止此方法的执行
		else
			return number * number;
	}

	public static int div() {
		return (10 / 0);
	}

	public static int div(int div) throws DivideByZeroRuntimeException
	// throws，有可能抛出异常，而在方法内没有被处理
	// 使用这样的方法，应该放在try{}里面
	{
		if (div == 0)
			throw new DivideByZeroRuntimeException("除数不能为0");
		// 抛出异常后，将立刻中止此方法的执行
		else
			return 10 / div;
	}

	public static void main(String[] args) {

		int div = 0;
		int number = 10;
		int result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个整数");
		div = scan.nextInt();
		// result=number/div; //有危险的写法
		// 用if-else规避风险
		if (div == 0) {
			System.out.println("除数不能为0");
			result = number / (div + 1);
			System.out.println("result=" + result);

		} else {
			result = number / div;
			System.out.println("result=" + result);

		}

		// 用Exception类，不过一般不要直接用Exception类
		try {
			result = 10;
			System.out.println("请再输入一个整数");
			div = scan.nextInt();
			if (div == 0) {
				throw new Exception("除数不能为0");
				// 将不能再添加语句
				// result=number/(div+1);
				// System.out.println("result="+result);
			} else {
				result = number / div;
				System.out.println("result=" + result);
			}
		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println("result=" + result);
		} finally {
			System.out.println("FINAL");
		}

		// 用自定义的DivideByZeroException异常，较好的用法
		try {
			result = 10;
			System.out.println("2:请再输入一个整数");
			div = scan.nextInt();
			if (div == 0)
				throw new DivideByZeroException();
			else {
				result = number / div;
				System.out.println("result=" + result);
			}
		} catch (DivideByZeroException e) {
			System.out.println(e.getMessage());
			System.out.println("result=" + result);
		} 
		
		// 使用还有未处理异常可能的div()方法
		try {
			ExceptionDemo.div(10, 0);
			ExceptionDemo.sqrt(100);
		} catch (DivideByZeroException e) {
			System.out.println(e.getMessage());
		} catch (SqrtExceedException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// 对于unchecked exception, 可以直接使用，异常最终被抛出到控制台
		ExceptionDemo.div();
		ExceptionDemo.div(10);
		// ExceptionDemo.div(10, 0); //此句话将出错
		try{
			int temp=10/0;
		}catch(Exception e){
			
		}
	}
}
