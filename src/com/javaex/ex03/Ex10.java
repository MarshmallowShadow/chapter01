package com.javaex.ex03;
import java.util.*;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바  2.C  3.C++  4.파이썬)");
		System.out.println("과목번호: ");
		num = sc.nextInt();
		
		if(num == 1) System.out.println("R101호");
		else if(num == 2) System.out.println("R102호");
		else if(num == 3) System.out.println("R103호");
		else System.out.println("R104호");
	}
}
