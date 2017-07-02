package lek5.genome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenomeWithHash {

	private static final int GENOME_SIZE = 10;
	private static final int WORD_SIZE = 2;

	public static int findDuplicates(byte[] data, int wordSize) {

		Set<Word> set = new HashSet<>();

		int count = 0;
		for (int i = 0; i <= data.length - wordSize; i++) {
			Word word = new Word(data, i, wordSize);
			if (set.contains(word)) {
				count++;
			} else {
				set.add(word);
			}
			
		}

		return count;
	}

}
