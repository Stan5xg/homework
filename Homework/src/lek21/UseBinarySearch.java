package lek21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class UseBinarySearch {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		fill(list, 10);
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		System.out.println(BinarySearch.binarySearch(list, list.get(4)));;
		
	}

	private static void fill(List<Integer> list, int size) {
		Random r = new Random();
		
		while(list.size() < size) {
			list.add(r.nextInt(size));
		}
		
	}
}
