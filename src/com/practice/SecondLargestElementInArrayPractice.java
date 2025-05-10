package com.practice;

public class SecondLargestElementInArrayPractice {

	public static void main(String[] args) {
		int a[]= {1,3,3,7,5};
		
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for(int no:a) {
			if(no>largest) {
				secondLargest=largest;
				largest=no;
			}
			else if(no>secondLargest && no!=largest) {
				secondLargest=no;
			}
		}
		System.out.println("Second largest number in an array is "+secondLargest);

	}

}
