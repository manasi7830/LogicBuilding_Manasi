package com.question1;

import java.util.HashSet;

public class Pangramwithset {

	public static void main(String[] args) {
		String input = "The quick brown fox jumps over the lazy dog";
		boolean result = checkPangram(input);
		if (result) {
			System.out.println("Its a Pangram");
		} else {
			System.out.println("Its not a Pangram");
		}
	}

	private static boolean checkPangram(String input) {
		HashSet<Character> characterSet = new HashSet<Character>();
		char inputChar[] = input.toLowerCase().toCharArray();
		for (char c : inputChar) {
			if (Character.isLetter(c)) {
				characterSet.add(c);
			}
		}
		if (characterSet.size() == 26) {
			return true;
		}
		return false;
	}
}
