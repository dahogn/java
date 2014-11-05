/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-10-24 
 * 4.4 说明面向对象的封装性体现，注意Getter和Setter
 *  这段代码必须特别好的理解
 *  */
package cn.sdu.edu.sc.java.chapt4;

public class Rectangle {

	/*
	 * 属性声明为private，体现封装性属性可以具有默认值，如果不指定，系统会默认分配，如int为0
	 */
	private int length = 200;
	private int width = 100;

	/* 使用Getter()和Setter()，将属性暴露出去 */
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int calcArea() {
		int area = length * width;
		return area;
	}

	/* 注意 this的用法 */
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	/*
	 * 默认构造器 如果类没有构造器，那么系统会生成一个没有形式化参数的构造器； 如果显式定义了构造器，那么默认构造器将不起作用，必须通过编码显式声明
	 */
	public Rectangle() {
		this(10, 20);
	}

	/* equals()方法的定义，此处这不是一个好的写法 */
	public boolean equals(Rectangle rect) {
		if (rect == null)
			return false;
		if (this.length == rect.length && this.width == rect.width)
			return true;
		else
			return false;
	}

	public static Rectangle creatRectangle(int length, int width) {
		Rectangle temp = new Rectangle(length, width);
		return temp;
	}

	public static void main(String[] args) {

		int l = 10;
		int w = 20;
		Rectangle rect;
		rect = creatRectangle(l, w);

		int ll=rect.getLength();
		
		/* 以下这段必须特别仔细的理解，成为理解Java的关键，请见附图1 */
		int iNumber = 5;// 和下一句话对比
		Rectangle rect1 = new Rectangle(10, 20);
		Rectangle rect2 = new Rectangle(10, 20);
		if (rect1 == rect2)
			System.out.println("rect1==rect2");
		else
			System.out.println("rect1!=rect2");

		if (rect1.equals(rect2))
			System.out.println("rect1 equals rect2");
		else
			System.out.println("rect1 NOT equals rect2");

		rect2 = rect1;
		if (rect1 == rect2)
			System.out.println("AGAIN rect1==rect2");
		else
			System.out.println("AGAIN rect1!=rect2");
	}

}
