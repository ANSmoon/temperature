package homework_2;

import java.util.Scanner;

public class Season1 {
	public static void main(String[] args) {
		// Season1.java
		Scanner sc = new Scanner(System.in); // 입력 받을 객체 생성
											 // 객체는 한번만 생성하도록 반복문 밖에서 선언
		for(int i = 0; i < 3; i++) {	 	 // 총 3번의 입력
			System.out.print("월 입력 >> ");
			int month = sc.nextInt();		 // 입력받은 숫자를 저장할 변수 선언
											 // if 조건문을 통해 각 달별 메세지 출력
			if(3 <= month & month <= 5) {
				System.out.println(month + "월은 봄입니다.");
			}
			
			else if(6 <= month & month <= 8) {
				System.out.println(month + "월은 여름입니다.");
			}
			
			else if(9 <= month & month <= 11) {
				System.out.println(month + "월은 가을5입니다.");
			}
			
			else{
				System.out.println(month + "월은 겨울입니다.");
			}

		}
		sc.close();		// 사용한 객체는 꼭 닫아줄 수 있도록 한다. 										
	}
}
