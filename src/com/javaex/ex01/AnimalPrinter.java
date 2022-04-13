/* 
작성자: 최보승
작성일: 2022-04-13
설 명: 동물 출력하는 프로그램
 */

package com.javaex.ex01;
import java.util.*;

public class AnimalPrinter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String animal;
		
		while(true) {
			System.out.print("고양이 또는 강아지 입력하세요: ");
			animal = sc.next();
			System.out.println("분석중");
			
			if (animal.equals("고양이") || animal.equals("냥냥이") 
					|| animal.equals("cat") || animal.equals("kitten")) {
				System.out.println("             *     ,MMM8&&&.            *    \r\n"
								 + "                  MMMM88&&&&&    .           \r\n"
								 + "                 MMMM88&&&&&&&               \r\n"
								 + "     *           MMM88&&&&&&&&               \r\n"
								 + "                 MMM88&&&&&&&&               \r\n"
								 + "                 'MMM88&&&&&&'               \r\n"
								 + "                   'MMM8&&&'       *         \r\n"
								 + "          |\\___/|                            \r\n"
								 + "          )     (             .             '\r\n"
								 + "         =\\     /=                           \r\n"
								 + "           )===(       *                     \r\n"
								 + "          /     \\                            \r\n"
								 + "          |     |                            \r\n"
								 + "         /       \\                           \r\n"
								 + "         \\       /                           \r\n"
								 + "  _/\\_/\\_/\\__  _/_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_/\\_\r\n"
								 + "  |  |  |  |( (  |  |  |  |  |  |  |  |  |  |\r\n"
								 + "  |  |  |  | ) ) |  |  |  |  |  |  |  |  |  |\r\n"
								 + "  |  |  |  |(_(  |  |  |  |  |  |  |  |  |  |\r\n"
								 + "  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |\r\n"
								 + "  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |");
				break;
			}
			else if(animal.equals("강아지") || animal.equals("개") || animal.equals("멍멍이") || animal.equals("댕댕이")
					|| animal.equals("dog") || animal.equals("puppy")) {
				System.out.println("   .-------------.       .    .   *       *    \r\n"
								 + "  /_/_/_/_/_/_/_/ \\         *       .   )    . \r\n"
								 + " //_/_/_/_/_/_// _ \\ __          .        .    \r\n"
								 + "/_/_/_/_/_/_/_/|/ \\.' .`-o                     \r\n"
								 + " |             ||-'(/ ,--'                     \r\n"
								 + " |             ||  _ |                         \r\n"
								 + " |             ||'' ||                         \r\n"
								 + " |_____________|| |_|L                         ");
				break;
			}
			else if (animal.equals("개새끼")) {
				System.out.println("야 욕하지 말아라 시발새끼야");
				continue;
			}
			else if(animal.equals("bitch") || animal.equals("pussy") || animal.equals("son of a bitch")) {
				System.out.println("Hey no swearing you sack of shit");
				continue;
			}
			else {
				System.out.println("분석 실패 ㅠㅠ 다시 시도하세요");
				continue;
			}
		}
		
		sc.close();
	}
}
