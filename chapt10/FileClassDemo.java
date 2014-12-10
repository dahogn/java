package cn.sdu.edu.sc.java.chapt10;

/**
 * 说明File类的使用方法 
 * @author Dahogn
 * @version 1.01
 * @since 2008.12.10
 * 
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileClassDemo {
	public static void main(String[] args) {
		String name = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter file name:");
		name = scan.nextLine();
		File fileObject = new File(name);
		while ((!fileObject.exists()) || (!fileObject.canRead())) {
			if (!fileObject.exists())
				System.out.println("No such file");
			else if (!fileObject.canRead())
				System.out.println("That file is not readable.");
			System.out.println("Enter file name again:");
			name = scan.nextLine();
			fileObject = new File(name);
		}
		BufferedReader fileInput = null;
		try {
			fileInput = new BufferedReader(new FileReader(fileObject));
			// 可以使用File类型的fileObject作为FileReader的构造方法参数
			// 不能用于追加文件的方式
			System.out.println("The first Character in the file is:");
			int first = fileInput.read();
			System.out.println((char) first);

		} catch (FileNotFoundException e) {
			System.out.println("File was not found");
			System.out.println("or could not be opened.");
		} catch (IOException e) {
			System.out.println("Problem reading from file.");
		} finally {
			try {
				fileInput.close();
			} catch (IOException e) {
				System.out.println("Problem with close the stream");
			}
		}
	}
}
