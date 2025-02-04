package homework;

import java.util.Scanner;

public class Solution {
	static int N, L;
	static int[] score;
	static int[] cal;
	static int ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt(); // 재료의 수
			L = sc.nextInt(); // 제한 칼로리
			score = new int[N];
			cal = new int[N];

			for (int i = 0; i < N; i++) {
				score[i] = sc.nextInt();
				cal[i] = sc.nextInt();
			}

			hamburger(0, 0, 0);

			System.out.println("#" + tc + " " + ans);
		}
	}

	private static void hamburger(int idx, int sumt, int sumc) {

		if (sumc > L)
			return;
		if (idx == N) {
			if (sumt > ans) {
				ans = sumt;
			}
			return;
		}

		hamburger(idx + 1, sumt + score[idx], sumc + cal[idx]);
		hamburger(idx + 1, sumt, sumc);
	}
}