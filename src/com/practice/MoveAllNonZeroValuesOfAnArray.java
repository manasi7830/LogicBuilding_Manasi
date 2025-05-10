package com.practice;

public class MoveAllNonZeroValuesOfAnArray {

	public static void main(String[] args) {
		int a[]= {1,0,2,0,3,0};
		
		int nonZero=0;
		for(int current=0;current<=a.length-1;current++) {
			if(a[current]!=0) {
				int temp= a[nonZero];
				a[nonZero]=a[current];
				a[current]=temp;
				nonZero++;
			}
		}
		
		for(int x:a) {
			System.out.print(" "+x);
		}

	}

}
