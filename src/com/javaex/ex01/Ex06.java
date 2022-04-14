package com.javaex.ex01;

public class Ex06 {
	public static void main(String[] args) {
		/*
		 * byte < short < int < long < float < double
		 * char < int < ...
		 * char and byte and short usually has no relation
		 */
		
		int a = 100;
		long b;
		float c;
		
		b = a; //int converts to long
		c = b; //long converts to double
		
		System.out.println(c);
		
		double a1 = 420.69, a2 = 4.7;
		byte d1 = 2, d2;
		
		b = (int)a1;
		c = (float)b;
		
		System.out.println("c: " + c);
		
		c = (int)(a1/a2); //format when performing operations
		System.out.println("c: " + c);
		
		c = (int)(a1) / (int)(a2); //converts a1 and a2 to int first before performing operation
		System.out.println("c: " + c);
		
		//d2 = d1 + 3; //results in an type mismatch error (whole numbers are usually int)
		d2 = (byte)(d1 + 3);
		//d2 = d1 + (byte)(3); //type mismatch error occurs when doing it this way
		System.out.println("d2: " + d2);
	}
}
