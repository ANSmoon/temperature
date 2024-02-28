public class powerSet_1_iterate {
	public static void main(String[] args) {
		String[] material = { "단무지", "참치", "햄", "소고기" };
		int N = 4; // 재료는 4개
		int[] set = new int[N];

		// N개의 재료를 이용해 만들 수 있는 모든 경우의 수
		for (int i = 0; i < (1 << N); i++) {
//			System.out.println(i);
			// i => 부분집합의 값
			// i의 재료가 무엇인지 아는 방법은?
			String tmp = "";
			for(int j = 0; j < N; j++) { // 재료 검사
				// 1이라고 하는 값을 j번 << 하면서 값을 비교한다.
				if((i & (1<<j)) > 0) {
					tmp += material[j];
				}
			}
			System.out.println(tmp);
		}
		
		
//		for (int i = 0; i < 2; i++) {
//			set[0] = i;
//			for (int j = 0; j < 2; j++) {
//				set[1] = j;
//				for (int k = 0; k < 2; k++) {
//					set[2] = k;
//					for (int l = 0; l < 2; l++) {
//						set[3] = l;
//						System.out.println(Arrays.toString(set));
//
//						// 재료 확인을 위한 for 문
//						for (int m = 0; m < N; m++) {
//							if (set[m] == 1) {
//								System.out.println(material[m] + "김밥");
//							}
//						}
//					}
//				}
//			}
//		}
	}
}
