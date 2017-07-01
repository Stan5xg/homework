package lek4;

import java.util.Arrays;

public class Genome {
	
	/*
	 *      v
	 * TACAGATT
	 *       ^
	 */
	
	
	
	public static void main(String[] args) {
		byte[] data = Generator.getData(3000000);
		
		//System.out.println(dataToString(data));

		System.out.println(duplicatesCount(data, 20));		
	}

	private static String dataToString(byte[] data) {
		StringBuilder result = new StringBuilder();
		for (byte item : data) {
			result.append((char)item);
		}
		return result.toString();
		
	}

	private static int duplicatesCount(byte[] data, int w) {
		int count = 0;
		for (int i = 0; i < data.length - w; i++) {
			LABEL: for (int j = i + 1; j < data.length - w - 1; j++) {
				for (int k = 0; k < w; k++) {
					if (data[i+k] != data[j+k]) {			
						continue LABEL;
					}
				}
//				System.out.println("thing: " + dataToString(Arrays.copyOfRange(data, i, i+w)) + " i: " + i + " j: " + j);
				count ++;
			}
		}
		
		
		return count;
	}
	
	

}
