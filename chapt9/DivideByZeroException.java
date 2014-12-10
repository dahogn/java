/**
 * @author Dahogn
 * @version 1.00
 * @since 2012.11.27
 * 9.1 说明Java的异常机制
 */
package cn.sdu.edu.sc.java.chapt9;

public class DivideByZeroException extends Exception {

	public DivideByZeroException() {
		super("Divide By Zero");
	}

	public DivideByZeroException(String message) {
		super(message);
	}

	
}
