package homework;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr = {1,0,9,8,7,6,5,4,3,2,1};
		for(int i = 0; i < arr.length; i++)
			System.out.print((arr[i]));
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		String[] str = new String[x];
		
		for(int i  = 0; i < x; i++) {
			str[i] = sc.next();
		}
		
		for(int i = 0; i < x; i++) {
			System.out.println(str[i]);
		}
	}
}
