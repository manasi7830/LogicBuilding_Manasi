package com.question1;

public class SeperateNumericValuesFromAlphabet {

	public static void main(String[] args) {
		String input="Mana123si";
		StringBuilder number=new StringBuilder();
		StringBuilder alphabet=new StringBuilder();
		char[] inputArray=input.toCharArray();
		for(char currentchar:inputArray) {
			if(Character.isDigit(currentchar)) {
				number.append(currentchar);
			}
			else if(Character.isAlphabetic(currentchar)) {
				alphabet.append(currentchar);
			}
		}
		System.out.println("Aplhabets from String "+input+" are "+alphabet);
		System.out.println("Digits from String "+input+" are "+number);

	}

}
