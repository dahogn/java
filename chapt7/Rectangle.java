/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-11-19 
 * 7.4 Rectangle类，说明抽象类和接口的使用
 *  
 *  */

package cn.sdu.edu.sc.java.chapt7;

/*Java里面只能继承自一个父类，但是可以同时实现多个接口*/
public class Rectangle extends Shape implements AreaCountable {//实现接口
	private double length;// 长
	private double width;// 宽

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public Rectangle(double length, double width) {
		super(4);
		this.length = length;
		this.width = width;
	}

	public double getArea() {
		return (this.width * this.length);
	}

	public static void main(String[] args) {

		Rectangle rect = new Rectangle(10.0, 20.0);
		AreaCountable ac = rect;
		Shape s = rect;
		System.out.println("Edge of rect is " + rect.getEdge());
		System.out.println("Length of rect is " + rect.getLength());
		System.out.println("Area of rect is " + rect.getArea());

		//System.out.println("Edge of ac is " + ac.getEdge());//不能使用的方法
		//System.out.println("Length of ac is " + ac.getLength());//不能使用的方法
		System.out.println("Area of ac is " + ac.getArea());
		
		System.out.println("Edge of s is " + s.getEdge());
		//System.out.println("Length of s is " + s.getLength());//不能使用的方法
		System.out.println("Area of s is " + s.getArea());

	}

}
