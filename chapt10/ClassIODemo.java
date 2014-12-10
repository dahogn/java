package cn.sdu.edu.sc.java.chapt10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import cn.sdu.edu.sc.java.chapt6.Student;

/**
 * 说明对象的二进制读取和写入方法
 * 
 * @author Dahogn
 * @version 1.01
 * @since 2008.12.10
 */

public class ClassIODemo {
	public static void main(String[] args) {
		ObjectOutputStream outputStream = null;
		try {
			outputStream = new ObjectOutputStream(new FileOutputStream(
					"Student.records"));
		} catch (IOException e) {
			System.out
					.println("Error opening file Student.records for writing.");
			System.exit(0);
		}
		// Student类或者其父类必须已经 implements Serializable
		// 如果使用父类中定义的属性，父类必须implements Serializable
		Student oneRecord = new Student("Calif", 27);
		Student secondRecord = new Student("Black", 100);

		Student[] studlist = new Student[2];
		studlist[0] = oneRecord;
		studlist[1] = secondRecord;

		try {
			// 直接将一个对象写入到文件
			outputStream.writeObject(studlist);
			outputStream.writeObject(oneRecord);
			outputStream.writeObject(secondRecord);
		} catch (IOException e) {
			System.out.println("Error writing to file Student.records.");
			System.exit(0);
		} finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				System.out.println("Problem with close the stream");
			}
		}

		System.out.println("Records sent to file Student.record.");

		System.out.println("Now let's re-open the file and echo the records.");

		ObjectInputStream inputStream = null;

		try {
			inputStream = new ObjectInputStream(new FileInputStream(
					"Student.records"));
		} catch (IOException e) {
			System.out.println("Error opening file Student.records.");
			System.out.println("for reading.");
			System.exit(0);
		}

		Student readOne = null, readTwo = null;
		Student[] studlistAG = null;

		try {
			studlistAG = (Student[]) inputStream.readObject();
			readOne = (Student) inputStream.readObject();
			readTwo = (Student) inputStream.readObject();
		} catch (Exception e) {
			System.out.println("Error reading from file Student.records.");
			System.exit(0);
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				System.out.println("Problem with close the stream");
			}
		}

		System.out.println("The following were read\n"
				+ "from the file Student.record:");
		System.out.println(studlistAG[0]);
		System.out.println(studlistAG[1]);
		System.out.println(readOne);
		System.out.println(readTwo);

		System.out.println("End of program.");

	}
}
