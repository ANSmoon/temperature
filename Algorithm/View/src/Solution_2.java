import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2 {
	public static void main(String[] args) throws IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int N = Integer.parseInt(br.readLine());
			boolean[][] map = new boolean[N][256];
			int h;
			int cnt = 0;

			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for (int q = 0; q < N; q++) {
				h = Integer.parseInt(st.nextToken());
				if (h != 0) {
					map[q][h] = true;
					for (int j = h - 1; j > 0; j--) {
						map[q][j] = true;
					}
				}
			}
			
			for (int q = 2; q < N - 2; q++) {
				for (int j = 255; j >= 0; j--) {
					if (map[q][j] == true) {
						if (map[q - 2][j] != true && map[q - 1][j] != true && map[q + 1][j] != true
								&& map[q + 2][j] != true) {
							cnt++;
						}
					}

				}
			}
	        System.out.println(cnt);
	}
}