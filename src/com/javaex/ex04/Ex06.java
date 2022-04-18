package com.javaex.ex04;

public class Ex06 {
	public static void main(String[] args) {
		
		String star = "*";
		int i;
		int j;
		
		for(i=0; i<6; i++) {
			for(j=0; j<=i; j++) {
				System.out.print(star);
			}
			System.out.println("");
		}
	}
}
