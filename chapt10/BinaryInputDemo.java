package cn.sdu.edu.sc.java.chapt10;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 说明从二进制文件进行读取的方法
 * 
 * @author Dahogn
 * @version 1.01
 * @since 2008.12.10
 */
public class BinaryInputDemo {
	public static void main(String[] args) {
		ObjectInputStream inputStream = null;
		try {
			inputStream = new ObjectInputStream(new FileInputStream("data.dat"));
			double n = 0;

			System.out
					.println("Reading ALL the integers in the file data.dat.");
			while (true) {
				n = inputStream.readDouble();
				// 对于二进制文件，如果到达文件末尾，将产生 EOFException
				System.out.println(n);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File was not found or could not be opened.");
		} catch (EOFException e)// 仅针对二进制文件有效
		{
			System.out.println("End of reading from file.");
		} catch (IOException e) {
			System.out.println("Problem with input from file data.dat.");
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				System.out.println("Problem with close the stream");
			}
		}
	}

}
