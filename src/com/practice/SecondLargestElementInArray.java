package com.practice;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		int input[]= {10,20,30,50,60};
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for(int number:input) {
			if(number>largest) {
				secondLargest=largest;
				largest=number;
			}
			else if(number>secondLargest && number!=largest){
				number=secondLargest;
				
			}
			
		}System.out.println(secondLargest);

	}

}
