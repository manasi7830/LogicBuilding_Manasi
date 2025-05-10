package com.question1;

public class ReverseOnlyLetters {

	public static void main(String[] args) {
		// Reverse only letters

		String input = "1ab2";
		int left = 0;
		int right = input.length()-1;
		char[] inputArray = input.toCharArray();
		while (left < right) {
			if (!Character.isLetter(inputArray[left])) {
				left++;
			} else if (!Character.isLetter(inputArray[right])) {
				right--;
			} else {
				char temp;
				temp= inputArray[left] ;
				inputArray[left] = inputArray[right];
				inputArray[right] = temp;
				left++;
				right--;

			}
		}
		System.out.println("output is " +new String(inputArray));

	}

}
