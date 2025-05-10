package com.question1;

public class FindLargestElementInArray {

	public static void main(String[] args) {
		// This program is to find largest element in the array
		
		int input []= {10,20,30,40,-60,50};
		int largest=input[0];
		for(int i=1;i<=input.length-1;i++) {
			if (input[i]>largest) {
				largest=input[i];
				
			}
		}
		System.out.println(largest);

	}

}
