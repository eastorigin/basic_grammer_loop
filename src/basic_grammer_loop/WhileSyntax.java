package basic_grammer_loop;

import java.util.Random;

public class WhileSyntax {
	public static void main (String[] args) {
		
//		int count = 0;
//		
//		while (count < 10) {
//			System.out.println("반복 중입니다.");
//			count ++;
//		}
//		
//		System.out.println("반복이 종료되었습니다");
		
		// 무한반복
		// - 사용 X
//		while (true) {
//			System.out.println(Math.random());
//		}
		
		// Ctrl + Shift + o
		Random random = new Random();
		int enemyHealthPoint = random.nextInt(Integer.MAX_VALUE); //0 ~ 21억
		System.out.println(enemyHealthPoint);
		
		
		while (enemyHealthPoint > 0) {
			int damage = random.nextInt(1000); // 0 ~ 999
			System.out.println(damage);
			
			enemyHealthPoint -= damage;
			System.out.println(enemyHealthPoint);
			
		}
	}
}
