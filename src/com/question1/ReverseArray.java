package com.question1;

public class ReverseArray {

	public static void main(String[] args) {
		// This program is to reverse an array solution1
		//input array
		int input[]= {10,20,30,40};
		//empty array same length as of input array
		int reverseInput[]=new int[input.length];
		
		int reverseIndex=0;
		for(int index =input.length-1;index>=0;index--) {
			reverseInput[reverseIndex]=input[index];
			reverseIndex++;
			
		}
		
		for(int number:reverseInput) {
			System.out.print(number+" ");
		}
		System.out.println(" ");
		input=reverseInput;
		for(int number:input) {
			System.out.print(number+" ");
		}
		

	}

}
