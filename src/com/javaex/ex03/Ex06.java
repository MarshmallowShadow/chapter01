package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hr;
		
		System.out.print("근무시간");
		hr = sc.nextInt();
		
		int pay;
		
		if(hr <= 8) pay = hr * 10000;
		else pay = 8 * 10000 + ((hr-8) * (int)(10000*1.5));
			
		System.out.println("임금은 " + pay + "원 입니다.");
		
		sc.close();
	}
}
