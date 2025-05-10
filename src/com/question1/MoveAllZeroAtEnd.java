package com.question1;

public class MoveAllZeroAtEnd {

	public static void main(String[] args) {
		// Creating array
		int input[] = { 1, 0,0, 2, 0, 3, 0 };
		int temp;
		int putNonZeroValue = 0;

		for (int current = 0; current < input.length; current++) {
			if (input[current] != 0) {
				temp = input[putNonZeroValue];
				input[putNonZeroValue]=input[current];
				input[current] = temp;
				putNonZeroValue++;

			}

		}
		for (int newInput : input) {
			System.out.print(newInput + " ");
		}

	}

}
