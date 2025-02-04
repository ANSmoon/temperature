public class Array08_Medium {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 3, 4, 3, 2, 1, 5, 6, 7, 9, 0, 0, 6, 3, 1 };

		int count[] = new int[11];

		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		// Counting 배열로 중앙값 구하기
		// 앞에서부터 개수를 누적
		// 결국 총 길이의 절반만큼 가면 중앙값에 해당함
		
		System.out.println(arr.length);
		int sum = 0;
		int median = 0;
		for (int i = 0; i <= 9; i++) {
			sum += count[i];
			System.out.println("현재(" + i + ")까지 개수의 합 : " + sum);
			if (sum >= (arr.length / 2) + 1) {
				median = i;
				break;
			}
		}
		System.out.println(median);
	}
}