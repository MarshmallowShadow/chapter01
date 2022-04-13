/* 
작성자: 최보승
작성일: 2022-01-13
설 명: 나이 기록, 출력
 */

package com.javaex.ex01;

public class Ex01 {
	
	public static void main(String[] args) {
		
		/*
		 * int myAge;
		 * 
		 * myAge = 26; System.out.println("My age: " + myAge);
		 * 
		 * myAge = 27; System.out.println("My age after a year: " + myAge);
		 */
		
		byte no;
		no = 127;
		System.out.println(no);
		
		no++; // no값에서 +1
		System.out.println(no);
		
		Integer num = Integer.MAX_VALUE; //int 최대값, 다른 정수들도 이 클라스 있음
		System.out.println(num);
		//MIN_VALUE도 있음
		
		//long은 int 최대/최소값을 넘을때 끝에 L 필수
		Long no2 = -2147483648L;
		System.out.println(no2);
		
		//선언 후 초기화
		int var01;
		int var02;
		int var03;
		//int var01, va02, var03;
		
		var01 = 10;
		var02 = 20;
		var03 = 30;
		
		//선언과 초기화 동시
		int var04 = 10;
		int var05 = 20;
		int var06 = 30;
		
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);
		System.out.println(var04);
		System.out.println(var05);
		System.out.println(var06);
	}
	
}
