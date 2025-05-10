package com.practice;

public class MissingNumberInAnArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5, 6 };
		
		int totalNumbers = 6;
		int sumOfAllNumbers = (totalNumbers * (totalNumbers + 1) / 2);
		System.out.println(sumOfAllNumbers);
		int sumOfArray = 0;
		for (int i = 0; i <= a.length - 1; i++) 
		{
			sumOfArray = sumOfArray + a[i];
		}
		System.out.println(sumOfArray);
		
		int missingnumber= sumOfAllNumbers - sumOfArray;
		System.out.println(missingnumber);

	}
	
		
	
	
	

}
