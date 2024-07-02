package homework;

import java.util.Scanner;

public class AirCrashes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		int dif = 0;
		
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
			
			if (max <= arr[i])
				max = arr[i];
			
			if (min >= arr[i])
				min = arr[i];
		}
		if(min < arr[size]) dif = arr[size] - min;
		else System.out.println("-1");
		
	}
}
