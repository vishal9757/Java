package com.avalia.learning.java.sorting;

public class Main {

	public static void main(String[] args) {

		//int[] arr = { 8, 7, 6, 5, 4, 3, 2 };
		// s.print(s.bubbleSort(a));
		// System.out.println("");
		// s.print(s.selectionSort(a));
		MergeSort1 ms = new MergeSort1();
		// ms.sort(a, 0, a.length);

		// int[] arr = { 2, 4, 6, 8, 1, 3, 5, 9 };
		// int[] arr = { 5, 6, 7, 8, 1, 2, 3, 4 };
		//int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		//ms.sort(arr);
		
		int[] arr = ms.mergeTwo(new int[]{1,3,5,7},new int[]{2,4,6,8});
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

		// MergeSort1 m = new MergeSort1();
		// m.sort(a, 0, a.length);
		System.out.println();
		// BinarySearch bs = new BinarySearch();
		// int[] a1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// bs.search(a1, 9);
	}

}
