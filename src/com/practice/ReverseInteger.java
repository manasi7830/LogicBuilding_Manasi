package com.practice;

public class ReverseInteger {

	public static void main(String[] args) {

		int number = 321;
		int reverseNumber = 0;
		int lastDigit;
		while (number != 0) {
			lastDigit = number % 10;
			reverseNumber = reverseNumber * 10 + lastDigit;
			number = number / 10;

		}
		System.out.println(reverseNumber);

	}
}
