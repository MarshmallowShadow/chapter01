package com.javaex.ex01;

public class Ex05 {
	public static void main(String[] args) {
		
			final double pi = 3.14;
			double result01 = pi*5*5;
			System.out.println(result01);
			
			//pi = 3.1415926; //final은 pi값을 변경되지 않는다
			double result02 = pi*5*5;
			System.out.println(result02);
		}
}
