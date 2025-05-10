package com.question1;

public class SumOfArrayElement {

	public static void main(String[] args) {
		// This program is to calculate the sum of array element
		
		int num[]= {1,24,33,44};
		int sum=0;
//		uisng for each loop
//		for(int temp: num) {
//			sum=sum+temp;
//		}
		for(int i=0;i<=num.length-1;i++) {
			sum=sum+num[i];
		}
		System.out.println(sum);

	}

}
