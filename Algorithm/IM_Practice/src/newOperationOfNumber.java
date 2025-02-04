/*
 * Author : 문범수
 * Date : 2024-02-22
 * subject : 
 * main : 
 * issue : 
 * name : .java
 * duration : m
 * CodeNo : 1493
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class newOperationOfNumber {
	public static int result;
	public static StringTokenizer token;
	public static int[][] arr;
	public static int x;
	public static int y;
	public static int idx;
	public static int x_index1;
	public static int y_index1;
	public static int x_index2;
	public static int y_index2;

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int total = Integer.parseInt(reader.readLine());
		int index = 1;

		while (index <= total) {
			token = new StringTokenizer(reader.readLine());
			x = Integer.parseInt(token.nextToken());
			y = Integer.parseInt(token.nextToken());
			idx = 1;
			result = 0;
			arr = new int[1000][1000];
			int temp = 0;

			while (idx <= 10000) {
				for (int i = 1; i < 1000; i++) {
					temp = i;
					for (int j = 1; j <= i; j++) {
						if (temp < 1) {
							break;
						}
						arr[temp--][j] = idx++;
					}
				}
			}

			for (int i = 1; i < arr.length; i++) {
				for (int j = 1; j < arr[0].length; j++) {
					if (x == arr[i][j]) {
						x_index1 = i;
						y_index1 = j;
					} else if (y == arr[i][j]) {
						x_index2 = i;
						y_index2 = j;
					}
				}
			}
			result = arr[x_index1][y_index1] + arr[x_index2][y_index2];
			System.out.println("#" + index + " " + result);
			index++;
		}
	}
}
