package com.javaex.ex03;
import java.util.*;

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		int days;
		
		System.out.print("월을 입력하세요: ");
		month = sc.nextInt();
		
		switch(month) {
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 2:
				days = 28;
			default:
				days = 31;
				break;
		}
		
		System.out.println(days + "일입니다.");
		
		sc.close();
	}
}
