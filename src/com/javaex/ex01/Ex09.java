package com.javaex.ex01;
import java.util.*;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//논리 연산자
		System.out.print("숫자 하나 입력하세요: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		System.out.println("a < b -> " + (a < b));
		System.out.println("a > b -> " + (a > b));
		System.out.println("a <= b -> " + (a <= b));
		System.out.println("a >= b -> " + (a >= b));
		System.out.println("a == b -> " + (a == b));
		System.out.println("a != b -> " + (a != b));
		
		// && || 논리 연산자
		
		System.out.println("(a <= b) && (a != b) -> " + ((a <= b) && (a != b)));
		System.out.println("(a > b) && (a >= b) -> " + ((a > b) && (a >= b)));
		System.out.println("(a <= b) || (a != b) -> " + ((a <= b) || (a != b)));
		System.out.println("(a <= b) || (a == b) -> " + ((a <= b) || (a == b)));
		
		//시프트 연산자
		int c = 23;
		System.out.println("c >> 2:" + (c>>2));
		
	}
}
