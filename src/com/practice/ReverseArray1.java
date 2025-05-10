package com.practice;

public class ReverseArray1 {

	public static void main(String[] args) {

		int input[] = { 10, 20, 30, 40 };
		int left = 0;
		int right = input.length - 1;
		int temp;
		while (right > left) {
			temp = input[left];
			input[left] = input[right];
			input[right] = temp;
			left++;
			right--;
		}

		for (int number : input) {
			System.out.print(" "+number);

		}

	}

}
