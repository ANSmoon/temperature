// Author : 문범수
// Date : 2024-01-17
// duration : 30m
// name : 거미줄치기
// subject : 2차원 배열

package homework;

import java.util.Scanner;

public class SpiderWeb {
	public static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int[][] arr = new int[size][size];
		int[][] max_point = new int[size][size];
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				arr[i][j] = sc.nextInt();
				max_point[i][j] = 1;
			}
		}
		
		
		int[] first = { -1, 1, 0, 0, -1, -1, 1, 1 };
		int[] second = { 0, 0, -1, 1, -1, 1, -1, 1 };
		int dir1 = 0;
		int dir2 = 0;
		int disable = 0;
		int max = 0;
		int x = 0;
		int y = 0;
		int cnt = 0;
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(arr[i][j] == 1) {
					max_point[i][j] = 0;
				}
				cnt = 0;
				
				for(int k = 0; k < 8; k++) {
					disable = 0;
					dir1 = i + first[k];
					dir2 = j + second[k];
					while(dir1 >= 0 && dir1 < size && dir2 >= 0 && dir2 < size && disable < 2) {
						if(arr[dir1][dir2] == 0) {
							cnt++;
							disable = 0;
						}
						else{
							disable++;
						}
						dir1 += first[k];
						dir2 += second[k];
					}
				}
				max_point[i][j] += cnt;
			}
		}
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(max < max_point[i][j]) {
					max = max_point[i][j];
					x = i;
					y = j;
				}
				System.out.printf("%-3d",max_point[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(max);
		System.out.printf("(%d,%d)",x,y);
		
	}
}
