package lek23;

import java.util.Arrays;

public class RadixInt {

	public static void keyCount(int[] ints, int alphaLength) {
		int[] count = new int[alphaLength + 1];
		for (int i = 0; i < ints.length; i++) {
			int countInd = ints[i] + 1;
			count[countInd]++;
		}
		for (int i = 0; i < count.length - 1; i++) {
			count[i + 1] += count[i];
		}
		int[] aux = new int[ints.length];
		for (int i = 0; i < aux.length; i++) {
			int countInd = ints[i];
			int auxInd = count[countInd]++;
			aux[auxInd] = countInd;
		}
		for (int i = 0; i < aux.length; i++) {
			ints[i] = aux[i];
		}
	}

	public static final int[] intToByteArray(int value) {
		return new int[] { 
				(value) & 0xFF};
	}

	public static int getByte(int value, int byteCount) {
		return ((value >>> (byteCount * 8)) & 0xFF);
	}

	public static void sort(int[] ints) {
		int byteSize = 256;
		

		int currByteCount = 0;

		while (currByteCount <= 3) {
			int[] aux = new int[ints.length];
			int[] count = new int[byteSize  + 1];

			for (int i = 0; i < ints.length; i++) {
				int currByteVal = getByte(ints[i], currByteCount);
				int countInd = currByteVal + 1;
				count[countInd]++;
			}
			for (int i = 0; i < count.length - 1; i++) {
				count[i + 1] += count[i];
			}

			for (int i = 0; i < aux.length; i++) {
				int currByteVal = getByte(ints[i], currByteCount);
				int countInd = currByteVal;
				int auxInd = count[countInd]++;
				aux[auxInd] = ints[i];
			}

			for (int i = 0; i < aux.length; i++) {
				ints[i] = aux[i];
			}
			currByteCount ++;
		}
	}
	
	public static void main(String[] args) {

		int i = 1;
		System.out.println(getByte(i, 0));
		int[] ints = intToByteArray(i);
		System.out.println(Arrays.toString(ints));

		int i1 = -1;
		System.out.println(getByte(i1, 0));
		int[] ints1 = intToByteArray(i1);
		System.out.println(Arrays.toString(ints1));
	}

}
