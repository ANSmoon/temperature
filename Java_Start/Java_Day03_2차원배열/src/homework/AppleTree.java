// Author : 문범수
// Date : 2024-01-17
// duration : 20m
// name : 사과나무 영양분 구하기
// subject : 2차원 배열

package homework;

import java.util.Arrays;
import java.util.Scanner;

public class AppleTree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 전체크기 입력

		int[] dr = { -1, 1, 0, 0 };
		int[] dc = { 0, 0, -1, 1 };

		int[][] arr = new int[n][n];
		int[][] arr1 = new int[n][n];
		int[][] sum = new int[n][n];
		
		int max = 0;
		// 여러숫자 입력받기
		// 첫번째 방법 : split으로 받기
		for (int i = 0; i < n; i++) {
			String[] str = sc.next().split("");
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(str[j]);
				sum[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		// 각 자리에서 얻을 수 있는 최대합도 같은 배열 생성 후 상하좌우에 따라 덧셈
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < dr.length; k++) {
					int ni = i + dr[k];
					int nj = j + dc[k];
					if (ni >= 0 && ni < n && nj >= 0 && nj < n)
						sum[i][j] = sum[i][j] + arr[ni][nj];
				}
				if(max < sum[i][j]) max = sum[i][j];
			}
		}
		
		System.out.println(max);

		// 두번째 방법 : toCharArray()로 받기
		// 유니코드를 이용한 방식
		for (int i = 0; i < n; i++) {
			char[] str1 = sc.next().toCharArray();
			for (int j = 0; j < n; j++) {
				arr[i][j] = str1[j] - '0';
			}
		}

		sc.close();
	}
}
