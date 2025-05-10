package com.question1;

public class FibonnaciSeries {

	public static void main(String[] args) {
		//Fibonnaci Series
		int first=0;
		int second=1;
		System.out.print(first);
		System.out.print(" "+second);
		for(int i=2;i<=10;i++) {
			int next;
			next=first+second;
			System.out.print(" "+next);
			first=second;
			second=next;
		}

	}

}
