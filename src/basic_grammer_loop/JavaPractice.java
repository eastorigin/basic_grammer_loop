package basic_grammer_loop;

import java.util.Scanner;

public class JavaPractice {
	public static void main (String[] args) {
		// 문제 1번
		Scanner keyboard = new Scanner(System.in);
		System.out.println("손님의 예산을 입력하세요");
		int budget = keyboard.nextInt();
		System.out.println("영화 티켓 가격을 입력하세요");
		int movieFee = keyboard.nextInt();
		if(budget >= movieFee) {
			System.out.println("관람가능," + " 남은 예산: " + (budget - movieFee));
		}else {
			System.out.println("관람불가능," + " 모자란 예산: " + (movieFee - budget));
		}
		
		// 문제 2번
		while(true) {
			System.out.println("원하는 구구단 숫자를 입력하시오");
			int number = keyboard.nextInt();
			if(number == -1) {
				System.out.println("구구단 프로그램 종료");
				break;
			}else {
				System.out.println(number + "단");
				for(int i = 1; i < 10; i++) {
					System.out.println(number + " X " + i + " = " + number * i);
				}
			}
		}
		
		// 문제 3번
		for(int i = 1 ; i < 6; i++) {
			for(int j = 1; j < 6; j++) {
				if(i >= j) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
