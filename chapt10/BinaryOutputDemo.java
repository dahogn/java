package cn.sdu.edu.sc.java.chapt10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * 说明创建二进制文件并且向文件进行写入的方法
 * 
 * @author Dahogn
 * @version 1.01
 * @since 2009.12.10
 */

public class BinaryOutputDemo {
	public static void main(String[] args) {
		ObjectOutputStream outputStream = null;
		Scanner scan = null;
		try {
			outputStream = new ObjectOutputStream(new FileOutputStream(
					"data.dat"));
			System.out.println("Enter nonnegative integers, one per line.");
			System.out.println("Place a negative number at the end.");

			double n = 0.0;
			scan = new Scanner(System.in);
			do {
				n = scan.nextDouble();
				outputStream.writeDouble(n);
			} while (n >= 0);

			System.out
					.println("Numbers and sentinel value written to the file data.dat.");

		} catch (FileNotFoundException e) {
			System.out.println("File was not found or could not be opened.");
		} catch (IOException e) {
			System.out.println("Problem with output to file data.dat.");
		} finally {
			scan.close();
			try {
				outputStream.close();
			} catch (IOException e) {
				System.out.println("Problem with close the stream");
			}
		}
	}
}
