package com.question1;

public class PalindromeNumberUsingString {

	public static void main(String[] args) {

		int number = 128	;
		//Conver number into string 
		String originalNumberInString=Integer.toString(number);
		String originalNumberInString2=number+"";
		
		//reverse string using String Builder
		StringBuilder reverStringBuilder= new StringBuilder(originalNumberInString);
		String reverseString=reverStringBuilder.reverse().toString();
		System.out.println(reverStringBuilder.reverse());
		
		//compare tw strings 
		if(originalNumberInString.equals(reverseString)) {
			System.out.println("Palindrome!!");
		}
		else {
			System.out.println("Not Palindome");
		}
	}
}
