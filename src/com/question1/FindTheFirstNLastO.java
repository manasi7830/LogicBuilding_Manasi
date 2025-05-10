package com.question1;

public class FindTheFirstNLastO {

	public static void main(String[] args) {

		String input = "Hello oh world";

		int firstIndex = -1;
		int lastIndex = -1;

		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == 'o') {
				firstIndex = index;
				break;
			}
		}
		for (int index = input.length() - 1; index > 0; index--) {
			if (input.charAt(index) == 'o') {
				lastIndex = index;
				break;
			}
		}

		if (firstIndex < 0) {
			System.out.println("Character is not present");
		} else {

			System.out.println("First occurance of o is " + firstIndex + " Last occurance of o is " + lastIndex);
		}

	}

}
