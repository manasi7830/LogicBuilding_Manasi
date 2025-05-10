package com.question1;

import java.util.HashMap;

public class CountFrequencyOfCharacterInString {

	public static void main(String[] args) {
		String input = "madam";
		HashMap<Character, Integer> frequencyMap = new HashMap<Character, Integer>();
		char inputArray[] = input.toCharArray();
		for (char character : inputArray) {
			frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);

		}
		for (char c : frequencyMap.keySet()) {
			System.out.println(c + "   " + frequencyMap.get(c));
		}
	}

}
