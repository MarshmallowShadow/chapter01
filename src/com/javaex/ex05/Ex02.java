package com.javaex.ex05;


public class Ex02 {
	public static void main(String[] args) {
		int[] no = new int[5];
		
		for(int i=0; i< no.length; i++) {
			no[i] = (int)(Math.random()*45) + 1;
		}
		
		System.out.println("====================");
		
		for(int i=0; i< no.length; i++) {
			System.out.print(no[i] + " ");
		}
	}
}
