package com.practice;

public class FindLargestValueinArray {

	public static void main(String[] args) {

		int input[] = { 10, 60, 30, 40, 50 };

		int largest = input[0];

		for (int i = 0; i <= input.length - 1; i++) {
			if (input[i] > largest) {
				largest = input[i];
			}
		}
		System.out.println(largest);

	}

}
