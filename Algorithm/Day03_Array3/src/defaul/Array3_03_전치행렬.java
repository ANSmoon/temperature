package defaul;

public class Array3_03_전치행렬 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		printArr(arr);
		
		// 전치행렬로 전환
		
//		for(int r = 0; r < arr.length; r++) {
//			for(int c = 0; c < arr[0].length; c++) {
//				if(r < c) {
//					int tmp = arr[r][c];
//					arr[r][c] = arr[c][r];
//					arr[c][r] = tmp;
//				}
//			}
//		}
//		
//		printArr(arr);
		
		System.out.println();
		
		
		int[][] newArr = new int[arr.length][arr[0].length];
		for(int r = 0; r < newArr.length; r++) {
			for(int c = 0; c < newArr[0].length; c++) {
				newArr[r][c] = arr[newArr.length - c - 1][r];
			}
		}
		
		printArr(newArr);
		
	}
	public static void printArr(int[][] arr) {
		for(int r = 0; r < arr.length; r++) {
			for(int c = 0; c < arr[0].length; c++) {
				System.out.printf(arr[r][c] + " ");
			}
			System.out.println();
		}
	}
}
