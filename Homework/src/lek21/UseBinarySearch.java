package lek21;

import java.util.Arrays;
import java.util.Random;

public class UseBinarySearch {

	private static final int TEST_ARRAY_MAX_SIZE = 30;

	public static void main(String[] args) {
		testAgaintsLibraryBinSearch(20);
	}

	private static void testAgaintsLibraryBinSearch(int reps) {
		Random r = new Random();
		for (int i = 0; i < reps; i++) {
			int[] a = new int[TEST_ARRAY_MAX_SIZE];
			fill(a);
			Arrays.sort(a);
			int key = r.nextInt(a.length);
			int testingResult = BinarySearch.indexOf(a, key);
			int referenceResult = Arrays.binarySearch(a, key);
			
			boolean passed = testingResult == referenceResult;
			if (passed) {
				System.out.println(passed);
			} else {
				System.err.println(passed + " " + Arrays.toString(a) + " >" + key + " got " + testingResult + " need " + referenceResult);
			}
		}		
	}

	private static void fill(int[] a) {
		Random r = new Random();
		for(int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(a.length);
		}
	}
}
