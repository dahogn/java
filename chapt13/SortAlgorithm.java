package cn.sdu.edu.sc.java.chapt13;

public class SortAlgorithm {
	// -----------------------------------------------------------------
	// Sorts the specified array of objects using the selection
	// sort algorithm.
	// -----------------------------------------------------------------
	public static void selectionSort(int[] list) {
		int min;
		int temp;

		for (int index = 0; index < list.length - 1; index++) {
			min = index;
			for (int scan = index + 1; scan < list.length; scan++)
				if (list[scan] < list[min])
					min = scan;

			// Swap the values
			temp = list[min];
			list[min] = list[index];
			list[index] = temp;
		}
	}

	// -----------------------------------------------------------------
	// Sorts the specified array of objects using the insertion
	// sort algorithm.
	// --------- --------------------------------------------------------
	public static void insertionSort(int[] list) {
		for (int index = 1; index < list.length; index++) {
			int key = list[index];
			int position = index;

			// Shift larger values to the right
			while (position > 0 && key < list[position - 1]) {
				list[position] = list[position - 1];
				position--;
			}

			list[position] = key;
		}
	}
}
