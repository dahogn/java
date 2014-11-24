/**
 * @author 戴鸿君@SDU
 * @version 1.0
 * @date 2012-11-25 
 * 8.4 说明二维数组的使用方法
 *  
 *  */
package cn.sdu.edu.sc.java.chapt8;

public class TwoDimensionalArray {

	public static void showTable(int[][] table, int rowlength, int columnlength) {
		for (int row = 0; row < rowlength; row++) {
			System.out.print(row + 1 + ":\t");
			for (int column = 0; column < columnlength; column++)
				System.out.print(table[row][column] + "\t");
			System.out.print("\n");
		}
	}

	public static void showTable(int[][] table) {
		for (int row = 0; row < table.length; row++) {
			System.out.print(row + 1 + ":\t");
			for (int column = 0; column < table[row].length; column++)
				System.out.print(table[row][column] + "\t");
			System.out.print("\n");
		}
	}

	public static int[][] getBigTable(int rowlength, int columnlength) {
		int[][] temp = new int[rowlength][columnlength];
		for (int row = 0; row < rowlength; row++)
			for (int column = 0; column < columnlength; column++)
				temp[row][column] = row * 100 + column;
		return temp;
	}

	public static void main(String[] args) {
		int[][] table = new int[10][6];

		for (int row = 0; row < table.length; row++)
			for (int column = 0; column < table[0].length; column++)
				table[row][column] = row * 10 + column;

		System.out.println("显示table");
		TwoDimensionalArray.showTable(table, 10, 6);

		int[][] table2 = TwoDimensionalArray.getBigTable(11, 7);
		System.out.println("显示table2");
		TwoDimensionalArray.showTable(table2);

	}

}
