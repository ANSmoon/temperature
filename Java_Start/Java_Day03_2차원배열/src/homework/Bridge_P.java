// Author : 문범수
// Date : 2024-01-17
// duration : 
// name : 섬나라 다리짓기
// subject : 2차원 배열

package homework;

import java.util.Scanner;

public class Bridge_P {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// n * n 크기 배열 선언 ( 지도 )
		int[][] map = new int[n][n];

		// 지도 정보 입력 받기
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		// 최대값 저장
		int maxDistance = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				// 지금 위치가 섬인지 검사
				if (map[i][j] == 1) {

					// 섬이면 현재 위치로부터 사방탐색 하여 가로 또는 세로에 있는 섬과 거리 측정, 최대값 저장

					// 동쪽이 1인지 검사
					for (int d = 1; d < n; d++) {
						if (j + d < n && map[i][j + d] == 1) {
							maxDistance = Math.max(maxDistance, d - j);
							break;
						}
					}

					// 서쪽이 1인지 검사
					for (int d = 1; d < n; d++) {
						if (j - d > 0 && map[i][j - d] == 1) {
							maxDistance = Math.max(maxDistance, j - d);
							break;
						}
					}

					// 북쪽이 1인지 검사
					for (int d = 1; d < n; d++) {
						if (i - d > 0 && map[i - d][j] == 1) {
							maxDistance = Math.max(maxDistance, i - d);
							break;
						}
					}

					// 남쪽이 1인지 검사
					for (int d = 1; d < n; d++) {
						if (i + d < n && map[i + d][j] == 1) {
							maxDistance = Math.max(maxDistance, d - i);
							break;
						}
					}
				}
			}
		}

		System.out.println(maxDistance);
		sc.close();
	}
}
