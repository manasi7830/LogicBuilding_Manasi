package com.question1;

public class ReplaceVovelswithX {

	public static void main(String[] args) {
		String input = "Manasi";

		String input1 = input.toLowerCase();

		StringBuffer result = new StringBuffer();

		char inputArray[] = input1.toCharArray();
		for (char currentchar : inputArray) {
			if (isVowel( currentchar)) {
				result.append('x');
			} else {
				result.append(currentchar);
			}
		}
		System.out.println(result.toString());
	}

	public static boolean isVowel(char currentchar) {
		if (currentchar == 'a' || currentchar == 'e' || currentchar == 'i' || currentchar == 'o'
				|| currentchar == 'u') {
			return true;
		} else {
			return false;
		}
	}

}
