package com.practice;

public class LenghtOfLastWord {

	public static void main(String[] args) {
		// Program is to fine the length of the last word in string

		String s = " Hello World  ";
		int count = 0;
		String s1 = s.trim();
		char inputArray[] = s1.toCharArray();
		for (int i = inputArray.length-1; i>=0; i--) {
			if (inputArray[i] !=' ') {
				count++;

			} else if (count >= 0) {
				System.out.println(count);
				break;
			}
		}

	}

}
