package com.practice;

public class EvenWordsFromString {

	public static void main(String[] args) {

		String s1 = "This is very beautifual day";

		String inputArray[] = s1.split(" ");

		for (String x : inputArray) {
			if (x.length() % 2 == 0) {
				System.out.println(x);
			}

		}

	}

}
