package cn.sdu.edu.sc.java.chapt13;

public class SearchAlgorithm {
	/* 线性查找，从第一个元素开始查找 */
	public static int linearSearch(int[] list, int target) {
		int index = 0;
		boolean found = false;
		while (!found && index < list.length) {
			if (list[index] == target)
				found = true;
			else
				index++;
		}

		if (found)
			return list[index];
		else
			return -1;
	}

	/* 二分查找，非递归实现的算法 */
	public static int binarySearch(int[] list, int target) {
		int min = 0, max = list.length, mid = 0;
		boolean found = false;

		while (!found && min <= max) {
			mid = (min + max) / 2;
			if (list[mid] == target)
				found = true;
			else if (target < list[mid])
				max = mid - 1;
			else
				min = mid + 1;
		}

		if (found)
			return list[mid];
		else
			return -1;
	}
	public static void main(String[] args) {
		int[] a = {0,1,2,3,4,5,6,7,8,9};
		System.out.println("Found:"+SearchAlgorithm.binarySearch(a,3));
	}
}
