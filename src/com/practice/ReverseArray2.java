package com.practice;

public class ReverseArray2 {

	public static void main(String[] args) {


		int input[]= {60,50,40,30,20,10};
		
		int left=0;
		int right=input.length-1;
		int temp;
		
		while(right>left) {
			temp=input[left];
			input[left]=input[right];
			input[right]=temp;
			left++;
			right--;
			
		}
		
		for(int number:input) {
			System.out.println(number);
		}

	}

}
