/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-11-19 
 * 7.3 Circle类，说明抽象类的使用
 *  
 *  */
package cn.sdu.edu.sc.java.chapt7;

public class Circle extends Shape {
	private double rad;// 圆的半径

	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	}

	public Circle(double rad) {
		super(0);// 必须完成基类的构造，哪怕基类是抽象类
		this.rad = rad;
	}

	public double getArea() {
		return (Math.PI * this.rad * this.rad);
	}

	public static void main(String[] args) {
		Shape s = new Circle(10.0);// 父类的引用指向子类的对象
		System.out.println("Area of s is " + s.getArea());
	}

}
