package lek4;

import java.util.Random;

public class Generator {
	
	private static final byte[] ALPHABET = {'A', 'C', 'G', 'T'};
	
	public static byte[] getData(int length) {
		byte[] result = new byte[length];
		
		Random rnd = new  Random();
		
		for (int i = 0; i < result.length; i++) {
			result[i] = ALPHABET[rnd.nextInt(ALPHABET.length)];
		}
		
		
		return result;
	}
	
	

}
