/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-11-19 
 * 7.1 Shape类，说明抽象类的使用
 *  
 *  */

package cn.sdu.edu.sc.java.chapt7;

public abstract class Shape {
	private int edge;// 形状有几条边构成，认为圆形有0条边

	public int getEdge() {
		return edge;
	}

	public void setEdge(int edge) {
		this.edge = edge;
	}

	public Shape(int edge) {
		this.edge = edge;
	}

	public String toString() {
		return ("edge is " + this.edge);
	}

	/*
	 * 定义抽象方法，如果有一个方法定义为abstract，那么这个类必定为abstract（抽象类） 抽象类可以有构造器，但是不能直接生成抽象类的对象
	 */
	public abstract double getArea();

	/*
	 * 抽象类没有方法体，以下写法都不对 public abstract void getArea(); public abstract void
	 * getArea(){;}
	 */
	public static void main(String[] args) {
		// Shape s = new Shape(4); //不能生成抽象类的对象
		
		System.out.println("复习使用------------------------------------------------");
		Shape[] arr = new Shape[2];
		arr[0] = new Rectangle(10.0, 20.0);
		arr[1] = new Circle(15.0);
		for (int index = 0; index < arr.length; index++)
			System.out.println("Area of arr[" + index + "] is "
					+ arr[index].getArea());

	}
}
