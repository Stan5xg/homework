package lek23;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		Integer[] a = {5, 234, 3243,24 ,23,4,234,23,4,2 ,342,34,23, 42,34,23,4 ,23,4,23,4,24,5,4 ,645,7,46,57, 79,8,7, 0,9077};
//		int p = partition(a, 0, a.length-1);
//		System.out.println(p);
		sort(a, 0, a.length - 1);
		
		System.out.println(Arrays.toString(a));
	}

	private static void sort(Comparable[] a, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int p = partition(a, lo, hi);
		sort(a, lo, p-1);
		sort(a, p+1, hi);
		
	}

	public static int partition(Comparable[] a, int lo, int hi) {
		int i = lo;
		int j = hi + 1;
		while(true) {
			while(a[++i].compareTo(a[lo]) < 0) {
				if (i >= hi) {
					break;
				}
			}
			
			while(a[--j].compareTo(a[lo]) > 0) {
				if (j <= lo) {
					break;
				}
			}
			
			if (i>j) {
				break;
			}
			swap(a, i, j);
		}
		swap(a, lo, j);
		return j;
	}

	private static void swap(Comparable[] a, int i, int j) {
		Comparable tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}
