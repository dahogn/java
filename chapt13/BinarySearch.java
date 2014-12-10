package cn.sdu.edu.sc.java.chapt13;

import java.util.Scanner;

/**
 * 二分查找，递归实现版本
 * 
 * @author Dahogn
 * @version 1.01
 * @since 2009.11.25 Class for searching an already sorted array of ints. To
 *        search the sorted and completely filled array b, use the following:
 *        ArraySearcher bSearcher = new ArraySearcher(b); int index =
 *        bSearcher.find(target); index will be given an index of where target
 *        is located index will be set to -1 if target is not in the array.
 */
public class BinarySearch {
	private int[] a;

	/**
	 * Precondition: theArray is full and is sorted from lowest to highest.
	 */
	public BinarySearch(int[] theArray) {
		a = theArray;// a is now another name for theArray.
	}

	/**
	 * If target is in the array, returns the index of an occurrence of target.
	 * Returns -1 if target is not in the array.
	 */
	public int find(int target) {
		return search(target, 0, a.length - 1);
	}

	// Uses binary search to search for target in a[first] through
	// a[last] inclusive. Returns the index of target if target
	// is found. Returns -1 if target is not found.
	private int search(int target, int first, int last) {
		int result = -1;// to keep the compiler happy.
		int mid;
		if (first > last)
			result = -1;
		else {
			mid = (first + last) / 2;

			if (target == a[mid])
				result = mid;
			else if (target < a[mid])
				result = search(target, first, mid - 1);
			else
				// (target > a[mid])
				result = search(target, mid + 1, last);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] a = new int[10];
		System.out.println("Enter 10 integers in increasing order.");
		System.out.println("One per line.");
		int i;
		Scanner scan = new Scanner(System.in);
		for (i = 0; i < 10; i++)
			a[i] = scan.nextInt();

		System.out.println();
		for (i = 0; i < 10; i++)
			System.out.print("a[" + i + "]=" + a[i] + " ");
		System.out.println();
		System.out.println();

		BinarySearch finder = new BinarySearch(a);

		char ans;
		do {
			System.out.println("Enter a value to search for:");
			int target = scan.nextInt();
			int result = finder.find(target);

			if (result < 0)
				System.out.println(target + " is not in the array.");
			else
				System.out.println(target + " is at index " + result);

			System.out.println("Again?(y/n)");
			ans = scan.nextLine().charAt(0);
		} while ((ans == 'y') || (ans == 'Y'));

		System.out.println("May you find what you're searching for.");
	}
}
