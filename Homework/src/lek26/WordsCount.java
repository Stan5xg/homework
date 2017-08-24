package lek26;

import java.util.HashMap;
import java.util.Map;

public class WordsCount {

	public static String[] getWords(String text) {
		return text.split("\\W+");
	}

	public static Map<String, Integer> count(String[] words) {
		Map<String, Integer> result = new HashMap<>();
		for (String word : words) {
			Integer count = result.get(word);
			result.put(word, count == null ? 1 : ++count);			
		}
		return result;
	}
		
}
