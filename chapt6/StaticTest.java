package keywords;

/**
 * 说明static变量的使用方法
 * 
 * @author Dahogn
 * @version 1.01
 * @since 2009.10.20
 * 
 */

class Value {
	static int c = 0;

	Value() {
		c = 15;
	}

	Value(int i) {
		c = i;
	}

	static void inc() {
		c++;
	}
}

public class StaticTest {
	public static int m = 100;
	
	Value v = new Value(10);
	
	static Value v1, v2;
	
	static {//static代码段，用来给static变量赋初值
		prt("(STATIC1)v1.c=" + v1.c + " v2.c=" + v2.c);
		v1 = new Value(27);
		prt("v1.c=" + v1.c + " v2.c=" + v2.c);
		v2 = new Value(15);
		prt("(STATIC2)v1.c=" + v1.c + " v2.c=" + v2.c);
	}
	
	public static void prt(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {

		StaticTest ct = new StaticTest();
		
		prt("ct.v.c=" + ct.v.c);
		
		prt("(MAIN1)v1.c=" + v1.c + " v2.c=" + v2.c);
		v1.inc();
		prt("(MAIN2)v1.c=" + v1.c + " v2.c=" + v2.c);
		prt("ct.v.c=" + ct.v.c);
		prt("StaticVar.m=" + StaticTest.m);
	}
}
