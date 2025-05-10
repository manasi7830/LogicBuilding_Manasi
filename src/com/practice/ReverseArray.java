package com.practice;

public class ReverseArray {

	public static void main(String[] args) {
		
		int input[]= {10,20,45,67,89};
		int leftIndex=0;
		int rightIndex=input.length-1;
		int temp;
		
		while(rightIndex > leftIndex) {
			temp=input[leftIndex];
			input[leftIndex]=input[rightIndex];
			input[rightIndex]=temp;
			leftIndex++;
			rightIndex--;
		}
		
		for(int num:input) {
			System.out.print(num+" ");
		}
		
	}

}
