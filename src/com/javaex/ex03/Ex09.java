package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("숫자를 입력하세요:");
		num = sc.nextInt();
		
		if(num == 0) System.out.println("0 입니다");
		else if(num%2 == 0) System.out.println("짝수입니다");
		else System.out.println("홀수입니다");
		
		sc.close();
	}
}
