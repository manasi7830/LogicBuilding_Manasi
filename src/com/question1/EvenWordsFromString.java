package com.question1;

public class EvenWordsFromString {

	public static void main(String[] args) {
		// Print the even words from String

		String input = "Sky is blue and vast";
		String dataArray[] = input.split(" ");
		for (String word : dataArray) {
			int length = word.length();
			if (length % 2 == 0) {
				System.out.println(word);
			}

		}
	}
}
