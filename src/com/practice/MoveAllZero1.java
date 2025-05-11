package com.practice;

public class MoveAllZero1 {

	public static void main(String[] args) {
		int a[] = { 10, 0, 20, 0, 30, 0 };
		int temp;
		int nonZero = a.length-1;

		for (int currentIndex = a.length - 1; currentIndex >= 0; currentIndex--) {
			if (a[currentIndex] != 0) {
				temp = a[nonZero];
				a[nonZero] = a[currentIndex];
				a[currentIndex] = temp;
				nonZero--;
			}

		}
		
		for(int i:a) {
			System.out.print(" "+i);
		}

	}

}
