
public class 이등변삼각형_2 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		

		int left = 0;
		int right = 4;
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = left; j <= right; j++) {
				arr[i][j] = ++cnt;
			}
			if(i < 2) {
				left++;
				right--;
			}
			else {
				left--;
				right++;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == 0) {
					System.out.print("   ");
				}
				else
					System.out.printf("%-3d",arr[i][j]);					
			}
			System.out.println();
		}
	}
}
