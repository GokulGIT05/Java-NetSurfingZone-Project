package com.gk31To40.javaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Gk36DuplicateWords {

	public static void main(String[] args) {

		String inputLine = "Hi hi how are you you are";
		// case Sensitive Search
		findDuplicateWords(inputLine);
	}

	private static void findDuplicateWords(String inputLine) {

		// 1. Split the words by space
		// 2. Create HashMap
		// 3. Loop Words
		// 4. Check for Key and do the Validation
		// 4. Get the Key and loop it and check for value greater than 1.s

		String[] words = inputLine.split(" ");

		Map<String, Integer> mapOfWords = new HashMap<String, Integer>();

		for (String eachWord : words) {

			if (mapOfWords.containsKey(eachWord)) {
				mapOfWords.put(eachWord, mapOfWords.get(eachWord) + 1);
			} else {
				mapOfWords.put(eachWord, 1);
			}
		}

		Set<String> keyOfMap = mapOfWords.keySet();

		for (String eachKey : keyOfMap) {
			if (mapOfWords.get(eachKey) > 1) {
				System.out
						.println("The Word: \"" + eachKey + "\" is repeated \"" + mapOfWords.get(eachKey) + "\" times");
			}
		}

	}

}
