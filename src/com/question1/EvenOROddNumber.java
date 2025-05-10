package com.question1;

public class EvenOROddNumber {

	public static void main(String[] args) {
		// Program to check if number is even or odd

		int number = 20;

		if ((number & 1) == 1) {
			System.out.println(number + " " + "Number is odd number");

		} else {
			System.out.println(number + " " + "Number is even number");
		}

	}

}
