/*
 * Author : 문범수
 * Date : 2024-01-29
 * subject : 최대 최소 및 평균
 * name : Solution.java
 * duration : 10m
 * CodeNo : 1984
 */

package 중간_평균값_구하기;

import java.util.Scanner;

class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int t = 0;
		
		while(t < total) {
			int[] arr = new int[10];
			int min = 10000;
			int max = 0;
			int sum = 0;
			float avg = 0;
			
			for(int i = 0; i < 10; i++) {
				arr[i] = sc.nextInt();
				min = Math.min(arr[i], min);
				max = Math.max(arr[i], max);
				sum += arr[i];
			}
			sum += -(max + min);
			avg = (float)sum / 8;
			System.out.printf("#%d %.0f\n",t+1, avg);
			
			t++;
		}
	}
}
