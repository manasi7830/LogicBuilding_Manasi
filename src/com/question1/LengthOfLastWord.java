package com.question1;

public class LengthOfLastWord {

	public static void main(String[] args) {
		//find the length of last word in the string
		
		String s="   Hello my name is Ayansh   ";
		int count=0;
		String s1=s.trim();
		char inputArray[]=s1.toCharArray();
		for(int i=inputArray.length-1;i>=0;i--) {
			if(inputArray[i]!=' ') {
				count++;
			}
			else if(count>0) {
				System.out.println("Length of the last word in string is "+count);
				break;
			}
		}
	}

}
