package com.avalia.learning.java.sorting;

public class MergeSort1 {

	private void sort(int[] arr, int l, int r) {
		if (r - l <= 1) {
			return;
		}
		int m = (l + r) / 2;
		sort(arr, l, m);
		sort(arr, m, r);
		merge(arr, l, m, r);
	}

	public void sort(int[] arr) {
		sort(arr, 0, arr.length);
	}

	public void merge(int[] arr, int l, int m, int r) {
		int[] temp = new int[r - l];
		for (int i = l, j = m, k = 0; k < r - l; k++) {
			if (i == m) {
				temp[k] = arr[j++];
			} else if (j == r) {
				temp[k] = arr[i++];
			} else if (arr[i] <= arr[j]) {
				temp[k] = arr[i++];
			} else {
				temp[k] = arr[j++];
			}
		}
		for (int k = 0; k < r - l; k++) {
			arr[l + k] = temp[k];
		}
	}

	public int[] mergeTwo(int[] arr1, int[] arr2) {
		int[] temp = new int[arr1.length + arr2.length];
		for (int i = 0, j = 0, k = 0; k < temp.length; k++) {
			if (i == arr1.length) {
				temp[k] = arr2[j++];
			} else if (j == arr2.length) {
				temp[k] = arr2[i++];
			} else if (arr1[i] <= arr1[j]) {
				temp[k] = arr1[i++];
			} else {
				temp[k] = arr2[j++];
			}
		}
		return temp;
	}
}
