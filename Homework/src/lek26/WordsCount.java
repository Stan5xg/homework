package lek26;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;

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
//	public static Map<String, Integer> countStream(String[] words) {
//		Map<String, Integer> result = new HashMap<>();
//		Stream<String> input = Arrays.stream(words);
//		input.forEach(s -> result.put(s, result.containsKey(s) ? result.get(s)+1 : 1) );
//		return result;
//	}
	public static Map<String, Integer> countStream(String[] words) {
		Map<String, Integer> result = new HashMap<>();
		Stream<String> input = Arrays.stream(words);
		input.forEach(s -> result.merge(s, 1, Integer::sum) );
		return result;
	}

	public static Map<String, Integer> count(Stream<String> stream) {
		Map<String, Integer> result = new HashMap<>();
		return null;
	}
		
}

