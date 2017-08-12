package lek21;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortClassExample {
	
	public static void main(String[] args) {
		
		A[] a = new A[10];
		
		fill(a);
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		List<A> list = new LinkedList<>();
		
		for (int i = 0; i < 10; i++) {
			list.add(new A());
		}
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}

	private static void fill(A[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = new A();
		}
	}

}