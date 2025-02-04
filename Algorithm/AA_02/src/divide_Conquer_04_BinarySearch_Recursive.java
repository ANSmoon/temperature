
public class divide_Conquer_04_BinarySearch_Recursive {
	public static int[] arr;
	public static int key;
	
	public static void main(String[] args) {
		arr = new int[] {2,4,6,8,9,12,25,26};
		key = 7;
	}
	
	public static boolean binarySearch(int st, int ed) {
		if(st > ed) return false;
		
		int mid = (st + ed) / 2; // 정수의 기본 범위라 가정하고 고정
		
		// 같다면..
		if(arr[mid] == key) return true;
		
		// 중앙값이 더 크면..(왼쪽 구간으로..)
		else if(arr[mid] > key) return binarySearch(st, mid - 1);
		
		// 중앙값이 더 작으면(오른쪽 구간으로..)
		else return binarySearch(mid + 1, ed);
	}
}
