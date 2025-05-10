package com.practice;

public class SecondLargenstArray {

	public static void main(String[] args) {
		int input[] = { 10, 20, 30, 40, 60,55 };

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int number : input) {
			if (number > largest) {
				secondLargest = largest;
				largest = number;

			} else if(number>secondLargest && number!=largest) {
				secondLargest=number;
			}

		}
		
		System.out.println(secondLargest);

	}

}
