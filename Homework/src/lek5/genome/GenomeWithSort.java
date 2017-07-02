package lek5.genome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenomeWithSort {


	public static int findDuplicates(byte[] data, int wordSize) {
		
		
		List<Word> list = new ArrayList<>();

		for (int i = 0; i <= data.length - wordSize; i++) {
			list.add(new Word(data, i, wordSize));
		}
		
		if (list.size() <= 1) {
			return 0;
		}
		
		Collections.sort(list);

//		printList(data, wordSize, list);
		
		int count = 0;
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).equals(list.get(i-1))) {				
				count ++;
			}
		}
		
		return count;
	}

//	private static void printList(byte[] data, int wordSize, List<Word> list) {
//		System.out.println();
//		for (Word word : list) {
//			byte[] wordBytes = Arrays.copyOfRange(data, word.offset, word.offset + wordSize);
//			System.out.println(word.offset + " : " + new String(wordBytes));
//		}
//	}
}
