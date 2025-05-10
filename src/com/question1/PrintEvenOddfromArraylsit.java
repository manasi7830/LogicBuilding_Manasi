package com.question1;

import java.util.ArrayList;

public class PrintEvenOddfromArraylsit {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Java");
		al.add(24);
		al.add(13);
		al.add(13.45);

		for (Object o : al) {
			if (o instanceof Integer) {
				Integer i = (Integer) o;
				int x = i.intValue();
				if (x % 2 == 0) {
					System.out.println("Even is " + x);
				} else {

					System.out.println("Odd is " + x);
				}
			}
		}

	}

}
