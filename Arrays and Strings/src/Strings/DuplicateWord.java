package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateWord {
	
	public static void repetedWords(String sentences) {
		if(sentences == null || "".equals(sentences)) return;
		Map<String, Long> result = Stream.of(sentences.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		result.entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey()).forEach(System.out::println);
	}
	
	public static String firstRepetedWord(String sentences) {
		if(sentences == null || "".equals(sentences)) return "";
		Map<String, Integer> result = new HashMap<>();
		for (String word : sentences.split(" ")) {
			if(result.containsKey(word))
				return word;
			else
				result.put(word, 1);
		}
		return "";
	}
	
	public static void main(String[] args) {
//		repetedWords("Ravi had been saying that he had been there");
//		repetedWords("Ravi had been saying that");
//		repetedWords("had had had had");
//		repetedWords("");
		
		System.out.println(firstRepetedWord("Ravi had been saying that he had been there"));
		System.out.println(firstRepetedWord("Ravi had been saying that"));
		System.out.println(firstRepetedWord("he had had he"));
		System.out.println(firstRepetedWord("had had had he"));
		System.out.println(firstRepetedWord(""));
	}
}
