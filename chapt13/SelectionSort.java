package cn.sdu.edu.sc.java.chapt13;

/**
 * 选择排序，第一个简单的排序算法
 * 
 * @author Dahogn
 * @version 1.01
 * @since 2008.11.25 Class for sorting an array of base type int from smallest
 *        to largest.
 */
public class SelectionSort {
	/**
	 * Precondition: Every indexed variable of a has a value. Action: Sorts a so
	 * that a[0] <= a[1] <= ... <= a[a.length - 1].
	 */
	public static void sort(int[] a) {
		int index, indexOfNextSmallest;
		for (index = 0; index < a.length - 1; index++) {// Place the correct
														// value in a[index]:
			indexOfNextSmallest = indexOfSmallest(index, a);
			interchange(index, indexOfNextSmallest, a);
			// a[0] <= a[1] <=...<= a[index] and these are the smallest
			// of the original array elements. The remaining positions
			// contain the rest of the original array elements.
		}
	}

	/**
	 * Returns the index of the smallest value among a[startIndex],
	 * a[startIndex+1], ... a[a.length - 1]
	 */
	private static int indexOfSmallest(int startIndex, int[] a) {
		int min = a[startIndex];
		int indexOfMin = startIndex;
		int index;
		for (index = startIndex + 1; index < a.length; index++)
			if (a[index] < min) {
				min = a[index];
				indexOfMin = index;
				// min is smallest of a[startIndex] through a[index]
			}
		return indexOfMin;
	}

	/**
	 * Precondition: i and j are legal indices for the array a. Postcondition:
	 * Values of a[i] and a[j] have been interchanged.
	 */
	private static void interchange(int i, int j, int[] a) {
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp; // original value of a[i]
	}

	public static void main(String[] args) {
		int[] b = { 7, 5, 11, 2, 16, 4, 18, 14, 12, 30 };

		System.out.println("Array values before sorting:");
		int i;
		for (i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
		System.out.println();

		SelectionSort.sort(b);

		System.out.println("Array values after sorting:");
		for (i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
		System.out.println();
	}
}
