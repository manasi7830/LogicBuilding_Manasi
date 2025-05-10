package com.question1;

public class ReverseInteger {

	public static void main(String[] args) {
		// This program is to reverse integer

		int number = 7678;//max no 2147483647
		int reverseNumber = 0;
		int lastDigit;

		while (number != 0) {

			lastDigit = number % 10;
			if (reverseNumber > Integer.MAX_VALUE / 10 || (reverseNumber == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
				System.out.println(0);
				System.exit(0);
			}
			if (reverseNumber < Integer.MIN_VALUE / 10 || (reverseNumber == Integer.MIN_VALUE && lastDigit < -8)) {
				System.out.println(0);
				System.exit(0);
			}
			reverseNumber = reverseNumber * 10 + lastDigit;
			number = number / 10;

		}
		System.out.println("Reverse number is=" + reverseNumber);

	}

}
