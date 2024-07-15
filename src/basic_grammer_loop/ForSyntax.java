package basic_grammer_loop;

import java.util.Scanner;

public class ForSyntax {
	public static void main (String[] args) {
		/*
		 * for (초기값; 반복조건; 증감식) {
		 * 		반복할 코드
		 * }
		 */
		
//		for (int i = 1; i < 101; i++) {
//			System.out.println(i);
//		}
		
		// 1. 1부터 1000까지의 합 출력
		int answer1 = 0;
		int answer2 = 0;
		int answer3 = 0;
		for(int i = 1; i < 1001; i++) {
			answer1 += i;
		}
		System.out.println(answer1);
		
		// 2. 1부터 100 중 짝수의 합 출력
		// 1. 연산자 (%) + if
		for(int i = 1; i < 101; i ++) {
			if(i % 2 == 0) {
				answer2 += i;
			}
		}
		System.out.println(answer2);
		
		// 2. 증감식 사용
		for(int i = 2; i < 101; i += 2) {
			answer3 += i;
		}
		System.out.println(answer3);
		
		// 3. 구구단 3단을 출력 (for)
		for(int i = 1; i < 10; i++) {
			System.out.println("3 X " + i + " = " + 3 * i);
		}
		
		// 4. 모든 구구단 출력 (이중 for - 중첩 for - nested for)
		for(int i = 2; i < 10; i++) {
			System.out.println(i + "단 시작");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
			System.out.println(i + "단 끝");
		}
		
		// 5. Scanner을 이용해서, 출력하고 싶은 구구단 수를 입력받으면 해당 구구단이 출력되는 코드.
		// 1 ~ 9 <-- Scanner를 이용해서 보고 싶은 곱할 수를 입력받는다.
		// 예) 단수: 10
		//		곱할 수: 20
		// 출력 예) 10 * 1 = 10
		//			..........
		// 10 * 20 = 200
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("구구단 몇 단을 원하십니까?");
		int number1 = keyboard.nextInt();
		System.out.println("곱할 수는 몇입니까?");
		int number2 = keyboard.nextInt();
		for(int i = 1; i < number2 + 1; i++) {
			System.out.println(number1 + " X " + i + " = " + number1 * i);
		}
		
		// Java 출력 방법
		// System.out.println(); // ln ==> line 출력한 뒤에 개행 (엔터)
		// System.out.print(); // 출력한 뒤 개행 X
		
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		System.out.println("1");
		
		System.out.print("2");
		System.out.print("2");
		System.out.print("2");
		System.out.print("2");
		System.out.print("2");
		System.out.print("2");
		System.out.print("2");
		System.out.print("2");
		System.out.print("2");
		
		System.out.println();
		
		System.out.print("3");
		System.out.print("3");
		System.out.print("3");
		System.out.print("3");
		System.out.print("3");
	}
}
