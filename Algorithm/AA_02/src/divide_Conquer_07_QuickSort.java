import java.util.Arrays;

public class divide_Conquer_07_QuickSort {
	public static int[] arr = { 5, 22, 34, 68, 97, 15, 4, 78, 95, 36, 34, 21 };

	public static void main(String[] args) {
		quickSort(0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int left, int right) {
		if (left < right) {
			int pivot = partition(left, right);
			quickSort(left, pivot - 1);
			quickSort(pivot + 1, right);
		}
	}
	
	public static int partition(int left, int right) {
		int pivot = arr[left]; // 왼쪽 끝을 pivot으로 지정
		int L = left + 1, R = right; // 시작 구간 -> pivot 1칸 옆

		while (L <= R) {
			// L : pivot 보다 큰 값을 찾을 때 까지 이동
			while (L <= R && arr[L] <= pivot) {
				// R : pivot 보다 작거나 같은 값을 만날때까지 이동
				L++;
			}
			while(arr[R] > pivot) {
				R--;
			}
			if(L < R) {
				int tmp = arr[L];
				arr[L] = arr[R];
				arr[R] = tmp;
			}
		}
		int tmp = arr[left];
		arr[left] = arr[R];
		arr[R] = tmp;
		
		return R; // pivot 위치
	}
}
