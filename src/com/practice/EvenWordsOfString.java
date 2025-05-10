package com.practice;

public class EvenWordsOfString {

	public static void main(String[] args) {
		//Print even words from String
		String input="Sky is blue and vast";
		//Split the String using Split() method
		String dataArray[]=input.split(" ");
		//Traverse the array using foreach loop
		for(String word:dataArray) {
			//Get the length of each word using length() method
			int length=word.length();
			//check if the word is even
			if(length%2==0) {
				System.out.println(word);
			}
		}
	}

}
