package keywords;

/**
 * 说明static的基本使用方法
 * 
 * @author Dahogn
 * @version 1.01
 * @since 2010.11.23
 * 
 */

public class StaticSimple {
	private static int count;// 设置计数器
	private int iNumber;

	public void inc() {
		iNumber++;
		count++;
	}

	public void print() {
		System.out.println("iNumber is " + iNumber + " AND count is " + count);
	}

	public static void dec() {
		count--;
		//iNumber--; //静态方法不能用this指向，不能使用类的非静态属性
	}

	public static void main(String[] args) {
		StaticSimple ss1 = new StaticSimple();
		ss1.inc();
		ss1.print();

		StaticSimple ss2 = new StaticSimple();
		ss2.inc();
		ss2.print();

		StaticSimple ss3 = new StaticSimple();
		ss3.inc();
		ss3.print();

		ss3.dec();// 不推荐的使用方式
		StaticSimple.dec();// 对于静态方法，直接用类名访问即可
		ss3.print();
	}
}
