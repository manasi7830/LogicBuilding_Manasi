package com.practice;

public class ReverseArrayPractice {

	public static void main(String[] args) {

		int number[]= {10,20,30,40,50,60};
		
		int left=0;
		int right=number.length-1;
		int temp;
		while(right>left) {
			temp=number[left];
			number[left]=number[right];
			number[right]=temp;
			left++;
			right--;
		}
		
		for(int x:number) {
			System.out.print(" "+x);
		}

	}

}
