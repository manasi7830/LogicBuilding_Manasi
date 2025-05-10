package com.practice;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		int number = 45;

		if (number % 2 == 0) {
			System.out.println("Number is even number");
		} else {
			System.out.println("Number is odd number");
		}
		
		if((number & 1)==1) {
			System.out.println("Number is odd number");
		}
		else
		{
			System.out.println("Number is even number");
		}

	}

}
