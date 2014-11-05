/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-10-31 
 * 5.2 说明static的用法
 *  static说明属性（或者方法）属于整个类，不属于某一个具体的对象；
 *  这是体现面向对象全局性的方法
 *  */

package cn.sdu.edu.sc.java.chapt5;

public class Person {
	private String name;// 名字
	private int id;// 标识
	private static int count;// 计数器，记录一共生成了多少个类

	public static int getCount() {
		return count;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public Person(String name) {
		this.name = name;
		id++;
		count++;
	}

	/* 静态方法中不能直接使用类中的非静态方法或者属性 */
	public static void test() {
		// id++;//报错
		count = 10;
	}

	public static void main(String[] args) {
		Person p1 = new Person("Tom");
		System.out.println("1: id is " + p1.getId());
		System.out.println("1: count is " + p1.getCount());

		Person p2 = new Person("Tom");
		System.out.println("2: id is " + p2.getId());
		System.out.println("2: count is " + p2.getCount());

		Person p3 = new Person("Tom");
		System.out.println("3: id is " + p3.getId());
		System.out.println("3: count is " + p3.getCount());
		/*不推荐用对象名调用静态方法，如 p3.getCount() */
		
		/* 声明为static的方法或者属性，可以直接用类名进行调用 */
		System.out.println("count is " + Person.getCount());
		
		/* main方法也是static，可以直接调用同一个类里面的static方法 */
		test();
		System.out.println("count is " + Person.getCount());
	}

}
