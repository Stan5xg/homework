package lek6;

import java.util.Arrays;

import mytestframework.Asserts;

public class ArraysCustom {
	
	public static void main(String[] args) {
		
//		int[] intArr = {1, 3, 5, 123, 3, 234234};
		long[] longArr1 = {1, 3, 5, 123, 3, 234234};
		long[] longArr2 = {-2234234,-3423545,2334234};
		long[] longArr3 = {};
		
		short[] shortArr = {1,2,535,342,234};
		int[] intArr = {5,4,3,2,1};
		byte[] byteArr = {8, 127, 23};
		
		double[] doubleArr = {1.0, 4.0, 234234.234235};
		float[] floatArr = {1.0f, 4.0f, 23.235f};
		
		char[] charArr = "Brown something dog jumps over a lazy fox or something".toCharArray();
		
		boolean[] boolArr = {false, true, true, false};
		
//		Asserts.assertEquals(toString(intArr), Arrays.toString(intArr));
		System.out.println(Asserts.assertEquals(toString(longArr1), Arrays.toString(longArr1)));
		System.out.println(Asserts.assertEquals(toString(longArr2), Arrays.toString(longArr2)));
		System.out.println(Asserts.assertEquals(toString(longArr3), Arrays.toString(longArr3)));

		System.out.println(Asserts.assertEquals(toString(shortArr), Arrays.toString(shortArr)));
		System.out.println(Asserts.assertEquals(toString(intArr), Arrays.toString(intArr)));
		System.out.println(Asserts.assertEquals(toString(byteArr), Arrays.toString(byteArr)));
		
		System.out.println(Asserts.assertEquals(toString(doubleArr), Arrays.toString(doubleArr)));
		System.out.println(Asserts.assertEquals(toString(floatArr), Arrays.toString(floatArr)));
		
		System.out.println(Asserts.assertEquals(toString(charArr), Arrays.toString(charArr)));
		
		System.out.println(Asserts.assertEquals(toString(boolArr), Arrays.toString(boolArr)));
	}

	public static String toString(long[] longArr) {
		String result = "[";
		for (int i = 0; i < longArr.length; i++) {
			result += longArr[i];
			if (i < longArr.length - 1) {
				result += ", ";
			}
		}
		return result + "]"; 
	}

	public static String toString(int[] intArr) {
		String result = "[";
		for (int i = 0; i < intArr.length; i++) {
			result += intArr[i];
			if (i < intArr.length - 1) {
				result += ", ";
			}
		}
		return result + "]"; 
	}
	
	public static String toString(byte[] arr) {
		String result = "[";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
			if (i < arr.length - 1) {
				result += ", ";
			}
		}
		return result + "]"; 
	}
	
	public static String toString(short[] arr) {
		String result = "[";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
			if (i < arr.length - 1) {
				result += ", ";
			}
		}
		return result + "]"; 
	}
	public static String toString(double[] arr) {
		String result = "[";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
			if (i < arr.length - 1) {
				result += ", ";
			}
		}
		return result + "]"; 
	}
	public static String toString(float[] arr) {
		String result = "[";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
			if (i < arr.length - 1) {
				result += ", ";
			}
		}
		return result + "]"; 
	}
	public static String toString(boolean[] arr) {
		String result = "[";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
			if (i < arr.length - 1) {
				result += ", ";
			}
		}
		return result + "]"; 
	}
	public static String toString(char[] arr) {
		String result = "[";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
			if (i < arr.length - 1) {
				result += ", ";
			}
		}
		return result + "]"; 
	}	
	public static String toString(Object[] arr) {
		String result = "[";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i].toString();
			if (i < arr.length - 1) {
				result += ", ";
			}
		}
		return result + "]"; 
	}	
	
	
	
	
	
}
