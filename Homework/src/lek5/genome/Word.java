package lek5.genome;

import java.util.Arrays;


public class Word implements Comparable<Word> {
	byte[] data;
	int offset;
	int wordSize;

	public Word(byte[] data, int i, int wordSize) {
		this.data = data;
		offset = i;
		this.wordSize = wordSize;
	}

	@Override
	public int compareTo(Word otherWord) {
		for (int i = 0; i < wordSize; i++) { 
			int diff = data[offset + i] - data[otherWord.offset + i];
			if (diff != 0) {
				return diff;
			}
		}
		return 0;
	}
	
	@Override
	public boolean equals(Object otherObj) {
		if (otherObj instanceof Word) {
			Word other = (Word) otherObj;
			
			if (other.data != data) {
				return false;
			}
			
			for (int i = 0; i < wordSize; i++) { 
				if (data[offset + i] != data[other.offset + i]) {
					return false;
				}
				
			}	
			
			return true;
			
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int result  = 17;
		int c;
		for (int i = offset; i < offset+wordSize; i++) {
			c = (int)data[i];
			result = 37*result + c;
		}		
		return result;
	}
	
	@Override
	public String toString() {
		byte[] wordBytes = Arrays.copyOfRange(data, offset, offset + wordSize);
		return new String(wordBytes);
	}
	
//	public static void main(String[] args) {
//		byte[] data = {'A','B','C','A','B','C','D'};
//		Word word1 = new Word(data, 0, 3);
//		Word word2 = new Word(data, 3, 3);
//		
//		
//		
//		System.out.println(word1 + " : " + word1.hashCode());
//		System.out.println(word2 + " : " + word2.hashCode());
//		
//		System.out.println(word1.equals(word2));
//		System.out.println(word2.equals(word1));
//
//		
//		Set<Word> set = new HashSet<>();
//
//		
//		set.add(word1);
//		
//		System.out.println();
//		System.out.println(set.contains(word2));
//
//	}

}
