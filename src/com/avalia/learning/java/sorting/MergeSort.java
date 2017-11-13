package com.avalia.learning.java.sorting;
/*
 * Java Program to Implement Merge Sort
 */

import java.util.Scanner;

/* Class MergeSort */
public class MergeSort {
	/* Merge Sort function */
	public void sort(int[] a, int low, int high) {
		int N = high - low;
		if (N <= 1)
			return;
		int mid = low + N / 2;
		// recursively sort
		System.out.println("mid-" + mid + "-low-" + low + "-high" + high);
		sort(a, low, mid);
		sort(a, mid, high);
		// merge two sorted subarrays
		mergeSort(a, low, high, N, mid);
	}

	public static void mergeSort(int[] a, int low, int high, int N, int mid) {
		int[] temp = new int[N];
		int i = low, j = mid;
		for (int k = 0; k < N; k++) {
			if (i == mid)
				temp[k] = a[j++];
			else if (j == high)
				temp[k] = a[i++];
			else if (a[j] < a[i])
				temp[k] = a[j++];
			else
				temp[k] = a[i++];
		}
		for (int k = 0; k < N; k++)
			a[low + k] = temp[k];
	}

}