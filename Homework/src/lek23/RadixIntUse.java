package lek23;

import java.util.Arrays;

public class RadixIntUse {
	public static void main(String[] args) {
		int[] ints = {-100, -13, -4500, 100, 5000, 21000, 34_000_256, 1, 0};
//		int[] smallInts = {1,2,3,4,0,4,3,0,1,3,2};
//		int[] alpha = {0,1,2,3,4};
//		RadixInt.keyCount(smallInts,alpha.length);
//		System.out.println(Arrays.toString(smallInts));
		RadixInt.sort(ints);
		System.out.println(Arrays.toString(ints));
		
	}

}
