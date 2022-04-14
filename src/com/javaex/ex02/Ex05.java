package com.javaex.ex02;
import java.util.*;

public class Ex05 {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름: ");
		String name = sc.next();
		
		System.out.println("반갑습니다, " + name + "님");
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println(name + "님의 나이가 " + age + "살로 확인되었습니다.");
		
		sc.close();
	}
}
