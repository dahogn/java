/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-11-19 
 * 6.4 说明引用作为属性、方法形参、方法返回值等
 *  
 *  */
package cn.sdu.edu.sc.java.chapt6;

public class UndergraduateDemo {
	private Undergraduate undergraduate;

	public Undergraduate getUndergraduate() {
		return undergraduate;
	}

	public void setUndergraduate(Undergraduate undergraduate) {
		this.undergraduate = undergraduate;
	}

	public UndergraduateDemo(String initialName, int initialStudentNumber,
			int initialLevel) {
		undergraduate = new Undergraduate(initialName, initialStudentNumber,
				initialLevel);
	}

	public void reset(String initialName, int initialStudentNumber,
			int initialLevel) {
		undergraduate = new Undergraduate(initialName, initialStudentNumber,
				initialLevel);
	}

	public void upgrade() {
		if (undergraduate == null)
			System.out.println("undergraduate is null");
		else {
			int level = undergraduate.getLevel();
			if (level < 4)
				undergraduate.setLevel(level + 1);
			else
				undergraduate.setLevel(4);
		}
	}

	public void showUpgradeAddOne(int level) {
		level = level + 1;
		System.out.println("undergraduate  AddOne is:" + level);
	}

	public static void ShowUndergraduate(Undergraduate ug) {
		ug.Output();
	}

	// 一般声明为static
	public void UpgradeUndergraduate(Undergraduate ug) {
		int level = ug.getLevel();
		if (level < 4)
			ug.setLevel(level + 1);
		else
			ug.setLevel(4);
	}

	// 一般声明为static
	public static void UpgradeUndergraduate(Object object) {
		if (object == null)
			System.out.println("Object is null");
		else if (object instanceof Undergraduate) {
			Undergraduate ug = (Undergraduate) object;
			int level = ug.getLevel();
			if (level < 4)
				ug.setLevel(level + 1);
			else
				ug.setLevel(4);
		} else
			System.out.println("Object is wrong");

	}

	public Undergraduate InitUndergraduate(String initialName,
			int initialStudentNumber, int initialLevel) {
		Undergraduate temp = new Undergraduate(initialName,
				initialStudentNumber, initialLevel);
		return temp;
		// 或者直接写 return new
		// Undergraduate(initialName,initialStudentNumber,initialLevel);
	}

	// 一般声明为static
	public static void ShowUndergraduate(Object object) {
		if (object == null)
			System.out.println("Object is null");
		else if (object instanceof Undergraduate) {
			Undergraduate ug = (Undergraduate) object;
			ug.Output();
		} else
			System.out.println("Object is wrong");
	}

	public static void main(String[] args) {

		Undergraduate undergraduate1 = new Undergraduate("Tom", 12345, 1);
		UndergraduateDemo demo = new UndergraduateDemo("Tom", 12345, 1);

		System.out.println("====Step1====");
		UndergraduateDemo.ShowUndergraduate(undergraduate1);

		System.out.println("====Step2====");

		demo.UpgradeUndergraduate(undergraduate1);

		demo.showUpgradeAddOne(undergraduate1.getLevel());

		undergraduate1.Output();// 注意此时level的值将变了

		System.out.println("====Step3====");
		Undergraduate undergraduate2 = demo
				.InitUndergraduate("Jerry", 12346, 2);
		UndergraduateDemo.ShowUndergraduate(undergraduate2);

		Person person = new Undergraduate("Tom", 12345, 1);

		System.out.println("====Step4====");
		System.out.println("由于定义了以Object为形参的方法，以下程序才能正确执行");
		UndergraduateDemo.ShowUndergraduate(person);

		System.out.println("====Step5====");
		UndergraduateDemo.UpgradeUndergraduate(person);
		person.Output();// 注意此时level的值将变了

		System.out.println("====Step6====");
		Student student = demo.InitUndergraduate("Jerry", 12346, 2);
		UndergraduateDemo.ShowUndergraduate(student);
	}
}