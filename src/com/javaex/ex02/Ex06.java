package com.javaex.ex02;

import java.util.*;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		System.out.print("이름: ");
		String name = sc.next();
		
		System.out.println("나이를 입력하세요");
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		System.out.println("키를 입력하세요");
		System.out.print("키: ");
		double height = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("안녕하세요, " + name + "님! 나이가 " + age + "살, 키는 " + height + "cm로 확인되었습니다.");
		
		sc.close();
	}
}
