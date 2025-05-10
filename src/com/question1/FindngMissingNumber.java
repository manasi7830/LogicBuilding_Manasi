package com.question1;

public class FindngMissingNumber {

	public static void main(String[] args) {
		//This program is to find the missing number in an array
		
		int number[]= {1,2,4,5,6};
		int totalNumbers=6;
		int totalSumOfAllNumners=(totalNumbers*(totalNumbers+1)/2);
		System.out.println(totalSumOfAllNumners);
		//Calculating sum of given array
		int sumofArray=0;
		for(int i=0;i<=number.length-1;i++) {
			sumofArray=sumofArray+number[i];
			
		}
		System.out.println(sumofArray);
		
		int missingNumber=totalSumOfAllNumners-sumofArray;
		System.out.println(missingNumber);
		

	}
	

}
