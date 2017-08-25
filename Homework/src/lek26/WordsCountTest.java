package lek26;

import java.util.Arrays;
import java.util.Map;

public class WordsCountTest {

	public static void main(String[] args) {
		String text = "one one two two three";
		String[] words = WordsCount.getWords(text);
		System.out.println(Arrays.toString(words));
		Map<String, Integer> counted = WordsCount.count(words);
		System.out.println(counted);

		Map<String, Integer> counted2 = WordsCount.countStream(words);
		System.out.println(counted2);
		
		
	}
	

}
