package homework_4;

import java.util.Scanner;

public class GabjaTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] x = { '갑', '을', '병', '정', '무', '기', '경', '신', '임', '계' }; 		   // 0 ~ 9
		char[] y = { '자', '축', '인', '묘', '진', '사', '오', '미', '신', '유', '술', '해' }; // 0 ~ 11

		while (true) {
			System.out.print("60갑자를 입력하세요 : ");
			String str;
			str = sc.nextLine();

			if (str.equals("종료"))
				break;
			
			char first = str.charAt(0);
			char second = str.charAt(1);

			// 1800년 부터 2100년까지 60갑자 출력
			// 기준일은 1444년 갑자년 원년

			int index_x = 0;
			int index_y = 0;

			// 갑 : 10으로 나눈 나머지 4
			// 자 : 12로 나눈 나머지 4
			// 최종 출력 : 1804를 더하고, 60씩 커지는 단계, 2100년 전까지
			// 1800년 : 경신

			for (int i = 0; i < 10; i++) {
				if (first == x[i]) {
					index_x = (i + 4) % 10;
				}
			}

			for (int j = 0; j < 12; j++) {
				if (second == y[j]) {
					index_y = (j + 4) % 12;
				}
			}

			for (int i = 1800; i <= 2100; i++) {
				if (i % 10 == index_x & i % 12 == index_y) {
					System.out.print(i + " ");
				}
			}
			System.out.println("");
		}
		sc.close();
	}
}
