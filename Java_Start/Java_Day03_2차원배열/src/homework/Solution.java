// Author : 문범수
// Date : 2024-01-17
// duration : 110m
// name : 빌딩건설
// subject : 2차원 배열

package homework;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test_case = sc.nextInt();
		int cnt = 0;
		
		while(cnt < test_case) {
			int size = sc.nextInt();
			int[][] max_point = new int[size][size];
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					max_point[i][j] = 1;
				}
			}
			int max = 0;

			// 조이스틱 방향키 설정

			int[] first = { -1, 1, 0, 0, -1, -1, 1, 1 };
			int[] second = { 0, 0, -1, 1, -1, 1, -1, 1 };

			int dir1 = 0;
			int dir2 = 0;

			char[][] str = new char[size][size];

			// String[] <> String str1 배열로 선언하냐의 차이
			// charAt은 하나의 문자열에 대해서만 가능

			for (int i = 0; i < size; i++) {
				String str1 = sc.next();
				for (int j = 0; j < size; j++) {
					str[i][j] = str1.charAt(j);
				}
			}

			// 입력값 확인
//			for (int i = 0; i < size; i++) {
//				for (int j = 0; j < size; j++) {
//					System.out.print(str[i][j]);
//				}
//				System.out.println();
//			}

			// 먼저 빌딩 높이 계산
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					for (int k = 0; k < 4; k++) {
						dir1 = i + first[k];
						dir2 = j + second[k];
						while (dir1 >= 0 && dir1 < size && dir2 >= 0 && dir2 < size) {
							if (str[dir1][dir2] == 'B') {
								max++;
							}
							dir1 += first[k];
							dir2 += second[k];
						}
					}
					max_point[i][j] += max;
					max = 0;
				}
			}

			// 주변에 공원있는지 탐색
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (str[i][j] == 'G') {
						max_point[i][j] = 0;
						continue;
					}
					for (int k = 0; k < 8; k++) {
						dir1 = i + first[k];
						dir2 = j + second[k];
						if (dir1 >= 0 && dir1 < size && dir2 >= 0 && dir2 < size) {
							if (str[dir1][dir2] == 'G') {
								max_point[i][j] = 2;
							}
						}
					}
				}
			}

//			for (int i = 0; i < size; i++) {
//				for (int j = 0; j < size; j++) {
//					if (max < max_point[i][j])
//						max = max_point[i][j];
//					System.out.print(max_point[i][j]);
//				}
//				System.out.println();
//			}

			System.out.println(max);
			cnt++;
		}
	}
}
