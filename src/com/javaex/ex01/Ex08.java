package com.javaex.ex01;

public class Ex08 {
	public static void main(String[] args) {
		int a = 7;
		int b = 2;
		
		System.out.println("산술 연산자\r\n");
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));
		System.out.println("7.0 % 1.5 = " + (7.0 % 1.5)); //1.0
		
		System.out.println();
		
		System.out.println("부호 연산자\r\n");
		int var = -3;
		int pVar = +var;
		int nVar = -var;
		
		System.out.println("pVar = " + pVar);
		System.out.println("nVar = " + nVar);
		
		System.out.println();
		
		System.out.println("증감연산자\r\n");
		System.out.println("a: " + a);
		System.out.println("a++: " + a++); //출력 후 증가
		System.out.println("new a: " + a);
		System.out.println("++a: " + ++a); //증가 후 출력
		System.out.println("new new a: " + a);
		
		System.out.println("b: " + b);
		System.out.println("b++: " + b++);
		System.out.println("new b: " + b);
		System.out.println("++b: " + ++b);
		System.out.println("new new b: " + b);
		
		System.out.println();
		
		
	}
}
