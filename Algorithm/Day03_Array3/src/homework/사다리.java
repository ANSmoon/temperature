/*
 * Author : 문범수
 * Date : 2024-01-31
 * subject : 사다리 경로 추적
 * name : 사다리.java
 * duration : 120m
 * CodeNo : 1210
 */

package homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 사다리 {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int x = 1;

		// 입력받기
		while (x <= 10) {
			int index = Integer.parseInt(reader.readLine());
			int[][] arr = new int[100][100];
			for (int i = 0; i < 100; i++) {
				StringTokenizer token = new StringTokenizer(reader.readLine());
				for (int j = 0; j < 100; j++) {
					arr[i][j] = Integer.parseInt(token.nextToken());
				}
			}
			int answer = pathFinder(arr);
			System.out.println("#" + index + " " + answer);
			index++;
			x++;
		}
	}

	// 길찾기 메소드 구현
	// 좌 우 아래 방향 탐색 구현
	// 좌 우가 없다면 계속 하강
	// 최종 리턴값 = column
	public static int pathFinder(int[][] arr) {
		int x = -1;
		List<Integer> starting_pos = new ArrayList<>();
//
//		// 하, 좌, 우 설정
//		int[] dir1 = { 1, 0, 0 };
//		int[] dir2 = { 0, -1, 1 };

		// 1로 시작하는 열 인덱스 저장
		for (int i = 0; i < 100; i++) {
			if (arr[0][i] == 1)
				starting_pos.add(i);
		}

		// 저장된 길이 만큼 출발지 설정
		for (int i = 0; i < starting_pos.size(); i++) {
			int start = starting_pos.get(i);
			int row = 0;
			while (row < 100) {
				if (start < 99 && arr[row][start + 1] == 1) {
					while (start < 99 && arr[row][start + 1] == 1) {
						start++;
					}
					row++;
				} else if (start > 0 && arr[row][start - 1] == 1) {
					while (start > 0 && arr[row][start - 1] == 1) {
						start--;
					}
					row++;
				} else if (start == 0 && arr[row][start + 1] == 0) {
					row++;
				}
				else if (start == 99 && arr[row][start - 1] == 0) {
					row++;
				}
				else if (start == 99 && arr[row][start - 1] == 1) {
					while (start > 0 && arr[row][start - 1] == 1) {
						start--;
					}
					row++;
				}
				else if(start == 0 && arr[row][start + 1] == 0) {
					while (start < 99 && arr[row][start + 1] == 1) {
						start++;
					}
					row++;
				}
				else if(arr[row][start+1] == 0 && arr[row][start-1] == 0){
					row++;
				}
				
				if (row == 99 && arr[row][start] == 2) {
					x = starting_pos.get(i);
					break;
				}else {
					continue;
				}
			}
		}
		return x;
	}
}
