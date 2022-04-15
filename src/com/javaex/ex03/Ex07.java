package com.javaex.ex03;
import java.util.*;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		int digitScore;
		int digit;
		int digitSum = 0;
		
		System.out.print("정수를 입력하세요: ");
		score = sc.nextInt();
		
		digitScore = score;
		
		while(digitScore != 0) {
			digit = digitScore % 10;
			digitSum += digit;
			digitScore /= 10;
		}
		
		if(digitSum%3 == 0) System.out.println(score + "은(는) 3의 배수입니다.");
		else System.out.println(score + "은(는) 3의 배수가 아닙니다.");
		
		sc.close();
	}
}
