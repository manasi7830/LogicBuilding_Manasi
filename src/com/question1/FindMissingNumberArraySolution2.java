package com.question1;

public class FindMissingNumberArraySolution2 {

	public static void main(String[] args) {
		// This program to find missing number in an array approach 2
		int input []= {1,2,4,5,6};
		int missingNumber=0;
		
		for(int no: input) {
			missingNumber=missingNumber^no;
			
		}
		for(int i=0;i<=6;i++) {
			missingNumber=missingNumber^i;
		}
		
		System.out.println(missingNumber);

	}

}
