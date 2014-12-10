/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-11-19 
 * 6.2 简单的Student类，说明继承关系，继承自Person类
 *  
 *  */

package cn.sdu.edu.sc.java.chapt6;

public class Student extends Person {
	private int StudentNo;// 学号

	public int getStudentNo() {
		return StudentNo;
	}

	public void setStudentNo(int studentNo) {
		StudentNo = studentNo;
	}

	public Student(String name, int StudentNo) {
		super(name);// 必须是第一句
		this.StudentNo = StudentNo;
		System.out
				.println("In Constructor Student(String name, int StudentNo)");
	}

	public Student() {
		// super();//即使不写super()，也必定会调用
		this.StudentNo = 1;
		System.out.println("In Constructor Student()");
	}
	
	/* 格式化输出方法 */
	public String toString() {
		return ("name is " + this.getName() + "; StudentNo is " + this.StudentNo);
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof Student) {
			Student s = (Student) obj;
			if (this.getName().equals(s.getName())
					&& this.StudentNo == s.StudentNo)
				return true;
			else
				return false;
		} else
			return false;
	}

	public boolean isSame(Student s) {
		if (s == null)
			return false;
		if (this.getName().equals(s.getName()) && this.StudentNo == s.StudentNo)
			return true;
		else
			return false;
	}

	/*
	 * 重载（Overridding）Person类中定义的 Output()方法， 两个方法名称一样，形参列表一样，此时返回值类型必定一样，否则会出错
	 */
	public void Output() {
		super.Output();// 调用父类的Output()方法
		System.out.println("StudentNo is " + this.getStudentNo());
	}

	/*
	 * 重写（ Overwritting） Output方法， 形参列表不一样，不会和Person类中定义的
	 * Output()方法构成Overridding
	 */
	public void Output(String notes) {
		this.Output();
		System.out.println("notes:" + notes);
	}

	public void OutputClassName() {
		System.out.println("Class Student");
	}

	public final void OutputSuperClassName() {//通过final关键字，指明子类不可以再Overridding这个方法
		super.OutputClassName();// 调用父类的方法，不会再产生Overridding
	}

	public static void main(String[] args) {
		Student s = new Student("Tom", 123);
		Person p = new Student("Tom", 123);

		if (s == p)
			System.out.println("s==p");
		else
			System.out.println("s!=p");
		if (s.equals(s))
			System.out.println("s equals p");
		else
			System.out.println("s NOT equals p");
		System.out.println("1---------------------------------------------");
		s.Output();
		p.Output();
		// p.Output("EX");//这个方法不能使用，Person类里面没有这个方法
		s.Output("EX");
		s.OutputSuperClassName();
		System.out.println("2---------------------------------------------");
		/* 通过isSame()方法，说明引用作为方法形参在继承关系中的应用 */
		Person p1 = new Student("Jerry", 1);
		Person p2 = new Student("Jerry", 123);
		Student s3 = new Student("Jerry", 1234);
		Person p4 = new Person("Jerry");

		if (p1.isSame(p2))
			System.out.println("p1 is Same p2");
		else
			System.out.println("p1 is NOT Same p2");

		if (p1.isSame(s3))
			System.out.println("p1 is Same s3");
		else
			System.out.println("p1 is NOT Same s3");
		if (s3.isSame(p1))
			System.out.println("s3 is Same p1");
		else
			System.out.println("s3 is NOT Same p1");

		if (p4.isSame(s3))
			System.out.println("p1 is Same p2");
		else
			System.out.println("p1 is NOT Same p2");
		if (s3.isSame(p4))
			System.out.println("s3 is Same p2");
		else
			System.out.println("s3 is NOT Same p2");

	}
}
