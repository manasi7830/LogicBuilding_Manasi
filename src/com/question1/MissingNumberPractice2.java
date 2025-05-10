package com.question1;

public class MissingNumberPractice2 {

	public static void main(String[] args) {
		int number[]= {1,2,4,5,6};
		int totalNumber=6;
		int sumOfAllArray=totalNumber*(totalNumber+1)/2;
		System.out.println(sumOfAllArray);
		int arraySum=0;
		for(int i=0;i<=number.length-1;i++) {
			arraySum=arraySum+number[i];
		}
		
		System.out.println(arraySum);
		
		int missingNumber=sumOfAllArray-arraySum;
		System.out.println("Missing number in an array is "+missingNumber);
		

	}

}
