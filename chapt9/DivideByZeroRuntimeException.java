/**
 * @author Dahogn
 * @version 1.00
 * @since 2012.11.27
 * 9.1 自定义异常DivideByZeroRuntimeException,说明Java的异常机制
 * 一般情况下，都会具有这两个构造函数，而且不会再重写getMessage()方法
 */

package cn.sdu.edu.sc.java.chapt9;

public class DivideByZeroRuntimeException extends RuntimeException {

	public DivideByZeroRuntimeException() {
		super("Divide By Zero");
	}

	public DivideByZeroRuntimeException(String message) {
		super(message);
	}

	
}
