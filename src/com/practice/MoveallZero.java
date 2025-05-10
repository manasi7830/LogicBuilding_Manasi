package com.practice;

public class MoveallZero {

	public static void main(String[] args) {
		int input[]= {1,0,2,0,3,0};
		
		int temp;
		int nonZero=0;
		
		for (int current = 0; current < input.length - 1; current++) {
			if (input[current] != 0) {
				temp = input[nonZero];
				input[nonZero] = input[current];
				input[current] = temp;
				nonZero++;
			}
		}
		
		for(int x:input) {
			System.out.print(" "+x);
		}
	}

}
