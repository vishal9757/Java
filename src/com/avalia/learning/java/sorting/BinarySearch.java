package com.avalia.learning.java.sorting;

public class BinarySearch {

	public void search(int[] arr, int a) {
		System.out.println(binarySearch(arr, 0, arr.length, a));
	}

	private int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x) {
				return binarySearch(arr, l, mid - 1, x);
			} else {
				return binarySearch(arr, mid + 1, r, x);
			}
		}
		return -1;
	}

}
