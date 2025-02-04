/*
 * Author : 문범수
 * Date : 2024-01-29
 * subject : 최대값
 * name : Solution.java
 * duration : 10m
 * CodeNo : 2068
 */

package Max;

import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int max = 0;
			int[] arr = new int[10];
			for (int i = 0; i < 10; i++) {
				arr[i] = sc.nextInt();
				if (max < arr[i]) {
					max = arr[i];
				}
			}
			System.out.printf("#%d %d\n", test_case, max);
		}
		sc.close();
	}
}