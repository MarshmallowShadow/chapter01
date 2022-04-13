package com.javaex.ex01;

public class Ex04 {
	public static void main(String[] args) {
		
		char ch01 = 'A';
		char ch02 = '한';
		
		System.out.println(ch01);
		System.out.println(ch02);
		System.out.println(ch01 + ch02); //ASCII코드 합산해서 출력
		
		char ch03 = 65; //ASCII 코드
		char ch04 = '6'; //실제값 (햇갈리면 안됨!)
		
		System.out.println(ch03);
		System.out.println(ch04);
		
		String str = "안녕하세요";
		System.out.println(str);
		
		String number = "31";
		String name = "Marsh";
		boolean isEnrolled = true;
		double grade = 97.6;
		String address = "서울시 송파구 풍납동";
		String major = "C.I.T.";
		int unit = 120;
		boolean haveMinor = false;
		String juminNo = "970429-7777777";
		String cellphone = "010-2074-8889";
		int age = 26;
		String email = "choiboseung@naver.com";
		
		System.out.println("번호: " + number);
		System.out.println("이름: " + name);
		System.out.println("등록여부: " + isEnrolled);
		System.out.println("학점: " + grade);
		System.out.println("주소: " + address);
		System.out.println("전공: " + major);
		System.out.println("이수 학점: " + unit);
		System.out.println("부전공여부: " + haveMinor);
		System.out.println("주민등록번호: " + juminNo);
		System.out.println("핸드폰번호: " + cellphone);
		System.out.println("나이: " + age);
		System.out.println("이메일주소: " + email);
		
	}
}
