package com.question1;

public class NumericHollowPeramid {

	public static void main(String[] args) {
		int number = 5;

		for (int rowNumber = 1; rowNumber <= number; rowNumber++) {

			for (int colNumber = 1; colNumber <= rowNumber; colNumber++) {

				if (colNumber == 1 || colNumber == rowNumber||rowNumber==number) {

					System.out.print(colNumber);
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println("  ");
		}

	}
}

