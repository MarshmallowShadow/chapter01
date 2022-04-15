package com.javaex.ex03;
import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int point;
		
		
		System.out.print("점수: ");
		point = sc.nextInt();
		
		if(point >= 60) System.out.println("합격입니다");
		else System.out.println("불합격입니다");
		
		sc.close();
	}
}
