
public class 탐색_3 {
	public static void main(String[] args) {

		int[][] arr = { { 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 }, };

		int n = 7;

		int[] dr = { -1, 1, 0, 0 };
		int[] dc = { 0, 0, -1, 1 };

		// 1. 행 우선 순회
		// 경계조건 추가 버전
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == 1) {
					System.out.println("i: " + i + " j: " + j);
					for (int k = 0; k < 4; k++) {
						for (int l = 1; l <= 3; l++) {
							int ni = i + l * dr[k];
							int nj = j + l * dc[k];

							if (ni >= 0 && nj < n && ni >= 0 && nj < n) {
								arr[ni][nj] = 2;

							}
						}
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
