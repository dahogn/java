package cn.sdu.edu.sc.java.chapt10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import cn.sdu.edu.sc.java.chapt6.Student;

public class TextFileOutputDemo {
	public static void main(String[] args) {
		PrintWriter outputStream = null;
		try// FileNotFoundException的构造方法会抛出FileNotFoundException异常
		{
			File file = new File("text.txt");
			outputStream = new PrintWriter(new FileOutputStream(file, true));
			// 使用true，表示追加到文本文件的末尾
			// new PrintWriter(new FileOutputStream("out.txt",true));
		} catch (FileNotFoundException e) {
			System.out.println("Error opening the file out.txt.");
			System.exit(0);
		}

		System.out.println("Enter three lines of text:");
		Scanner scan = new Scanner(System.in);
		String line = null;
		int count;
		for (count = 1; count <= 3; count++) {
			line = scan.nextLine();
			outputStream.println(count + " " + line);
		}
		// 文本文件调用类的tostring（）方法，输出一个对象
		System.out.println("Output the object student1.");
		Student student1 = new Student("Tom", 12345);
		System.out.println(student1);
		outputStream.println(student1);

		System.out.println("Those lines were written to out.");

		scan.close();
		outputStream.close();
	}
}
