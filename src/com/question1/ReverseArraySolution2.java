package com.question1;

public class ReverseArraySolution2 {

	public static void main(String[] args) {
		// The program is to reverse an array using two pointer approach
		
		int input[]= {10,20,30,40,50};
		int leftIndex=0;
		int rightIndex=input.length-1;
		int temp;
		
		while(rightIndex>leftIndex) {
			temp=input[leftIndex];
			input[leftIndex]=input[rightIndex];
			input[rightIndex]=temp;
			leftIndex++;
			rightIndex--;
			}
		
		for(int num: input) {
			System.out.print(num+" ");
			
		}

	}

}
