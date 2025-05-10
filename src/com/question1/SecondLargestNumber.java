package com.question1;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// This program is to find second largest number in an array

		int input[] = { 1, 3, 2, 7, 5,6 };
		// Create two variable Largest and Second largest and initialize it with minimum value
		int largestNumber = Integer.MIN_VALUE;
		int secondLargestNumber = Integer.MIN_VALUE;
		//Traverse array 
		for (int number : input) {
			//Compare the number with largest number 
			if (number > largestNumber) {
				//if it greater then, update the second largest value with the value of largest number
				secondLargestNumber = largestNumber;
				//As the number is greater assign it as largest number
				largestNumber = number;
			}
			//if the number is less than largest number but greater than second largest number assign it to second largest number
			else if (number>secondLargestNumber && number!=largestNumber) {
				secondLargestNumber=number;
			}
			

		}System.out.println("Second Largest Number in array is "+secondLargestNumber);

	}

}