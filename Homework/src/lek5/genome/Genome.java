package lek5.genome;

import java.util.Arrays;

public class Genome {
	

	private static final int GENOME_SIZE = 10;
	private static final int WORD_SIZE = 2;
	
	/*
	 * A C G T
	 * 
	 * N = 100000
	 * 
	 *     offset1  
	 * AAACCACAGTAGCTCGAATCGCCTAGCGCTATGCGCGGATCGCGCGCATTCGGATCTCT
	 *                offset2
	 * AAA
	 * AAC
	 * ACC           
	 * CCA
	 * 
	 * 
	 * 1Tb
	 * 
	 * N = 8
	 * W = 2
	 * 012345
	 * ACGTACGT
	 *  123456
	 */
	
	public static void main(String[] args) {
		
		byte[] data = DataGenerator.generate(GENOME_SIZE);
		
		
		
		System.out.println(findDuplicates(data, WORD_SIZE));
		
	}
	
	

	public static int findDuplicates(byte[] data, int w) {
		int counter = 0;
		for (int i = 0; i < data.length - w; i++) {
			for (int j = i+1; j < data.length - w + 1; j++) {
				boolean found = true;
				for (int k = 0; k < w; k++) {
					if (data[i + k] != data[j + k]) {
						found = false;
						break;
					}
				}
				if (found) {
					byte[] wordBytes1 = Arrays.copyOfRange(data, i, i + w);
					byte[] wordBytes2 = Arrays.copyOfRange(data, j, j + w);
									
//					System.out.println(i + " : " + new String(wordBytes2) + " == " + j + " : " + new String(wordBytes1) );
//					System.out.println(count);
					counter++;
					break;
				}
			}
		}
		return(counter);
	}



	public static void printData(byte[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print((char)data[i]);
		}		
	}

}
