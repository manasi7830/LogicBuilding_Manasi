package com.question1;

public class PalindromeNumber {

	public static void main(String[] args) {

		int number = 121;
		int originalNumber=number;
		int reverseNumber = 0;
		int lastDigit;
		while (number != 0) {
			lastDigit = number % 10;
			reverseNumber = reverseNumber * 10 + lastDigit;
			number = number / 10;
		}
		System.out.println(reverseNumber);
		if((originalNumber-reverseNumber)==0) {
			System.out.println("Number is palindrome number");
		}else {
			System.out.println("Number is not palindrome number");
		}
	}
}
