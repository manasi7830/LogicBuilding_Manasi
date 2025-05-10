package com.practice;

public class MissingNumberInArrayPractice {

	public static void main(String[] args) {
		int input[]= {1,2,4,5,6};
		int totalNumbers=6;
		int totalSumOfAllNumners=(totalNumbers*(totalNumbers+1)/2);
		System.out.println(totalSumOfAllNumners);
		int sumOfArray=0;
		for(int number=0;number<=input.length-1;number++) {
			sumOfArray=sumOfArray+input[number];
			
		}
		System.out.println(sumOfArray);
		
		int missingElement=totalSumOfAllNumners-sumOfArray;
		System.out.println("Missing number in an arry is "+missingElement);
		

	}

}
