package com.javaex.ex02;

public class Ex01 {
	public static void main(String[] args) {
		String str = "안녕";
		int i = 123123;
		String var01 = str + i;
		char c = 'A';
		
		System.out.print("안녕"); //라인 브레이크 하지 않음
		System.out.println("하세요");
		System.out.println(str);
		System.out.println(str + " " + str + "!");
		System.out.println(str + i);
		System.out.println(var01);
		System.out.println(i + i);
		System.out.println(c + c);
		System.out.println("안녕\n하세요");
		System.out.println("안녕\t하세요");
		System.out.println("안녕\\하세요");
		System.out.println("\"안녕하세요\"");
		System.out.println("안녕\r하세요");
	}
}
