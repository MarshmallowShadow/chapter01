package com.javaex.ex03;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int point;
		
		
		System.out.print("점수를 입력하세요: ");
		point = sc.nextInt();
		
		if(point >= 90) System.out.println("A 등급");
		else if(point >= 80) System.out.println("B 등급");
		else if(point >= 70) System.out.println("C 등급");
		else if(point >= 60) System.out.println("D 등급");
		else System.out.println("F 등급... 불합격입니다");
		
		sc.close();
	}
}
