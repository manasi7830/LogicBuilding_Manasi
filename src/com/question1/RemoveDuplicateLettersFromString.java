package com.question1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLettersFromString {

	public static void main(String[] args) {
		
		String input="Java";
		Set<Character> linkedHashSet= new LinkedHashSet<Character>();
		char inputCharArray[]=input.toCharArray();
		//String result="";	
		StringBuilder sb=new StringBuilder();
		for(char x: inputCharArray) {
			if(linkedHashSet.add(x)) {
				//result=result+x;
				sb.append(x);
			}
			
		}
		System.out.println(sb);


	}

}
