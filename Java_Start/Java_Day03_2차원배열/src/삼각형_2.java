
public class 삼각형_2 {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		
		int cnt = 0;
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - i; j++) {
				arr[i][j] = ++cnt;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
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
