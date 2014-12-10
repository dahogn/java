/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-11-19 
 * 6.3 简单的Undergraduate类，说明继承关系，继承自Student类
 *  
 *  */
package cn.sdu.edu.sc.java.chapt6;

public class Undergraduate extends Student {

	private int level;// 年级

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Undergraduate(String name, int StuNo, int level) {
		super(name, StuNo);
		this.level = level;
		System.out
				.println("In Constructor UndergraduateStudent(String name, int StuNo, byte level)");
	}

	public Undergraduate() {
		this.level = 1;
		System.out.println("In Constructor UndergraduateStudent()");
	}

	/*
	 * public void OutputSuperClassName() {//父类使用了final关键字，子类不可以再Overridding这个方法
	 * 
	 * }
	 */

	public static void main(String[] args) {
		Person p = new Undergraduate("Jerry", 2, 1);
		Undergraduate ug = (Undergraduate) p;
		ug.getLevel();
		p.getName();
		((Undergraduate) p).getLevel();// 隐式强制类型转换
		System.out.println("1---------------------------------------------");
		Undergraduate ug1 = new Undergraduate("Jerry", 2, 1);
		Undergraduate ug2 = new Undergraduate("Jerry", 2, 11);
		if (ug1.equals(ug2))//调用了Student类里面的equals()
			System.out.println("ug1 equals ug2");
		else
			System.out.println("ug1 NOT equals ug2");
	}

}
