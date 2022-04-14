package com.javaex.ex02;
import java.util.*;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름: ");
		String name = sc.next();
		
		System.out.println("반갑습니다, " + name + "님");
	}
}
