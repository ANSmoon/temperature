
public class 탐색_2 {
	public static void main(String[] args) {

		// delta 배열 만들기
		int[] dr = { -1, 1, 0, 0 };
		int[] dc = { 0, 0, -1, 1 };

		// 다음 배열에서 1이 들어있는 칸의 상화좌우에 인접한 칸에
		// 2 넣기
		int[][] arr = { { 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 1, 0 }, 
				{ 0, 0, 0, 0, 0 } };

		int n = 5;
		// 1. 행 우선 순회
		// 경계조건 추가 버전
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 1) {
					System.out.println("i: " + i + " j: " + j);
					for (int k = 0; k < 4; k++) {
						int ni = i + dr[k];
						int nj = j + dc[k];
						if (ni >= 0 && ni < n && nj >= 0 && nj < n) 
							arr[ni][nj] = 2;
						
					}
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%2d", arr[i][j]);
			}
			System.out.println();
		}
	}
}
