package homework_5;

import java.util.Scanner;

public class BlastFurnace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int first = sc.nextInt();
		int second = sc.nextInt();
		int total = sc.nextInt();
		int min = Math.abs(first - second);
		int select = 0;
		int sec = 1;
		int[] arr = new int[total];

		for (int i = 0; i < total; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < total; i++) {
			if (min > Math.abs(arr[i] - second)) {
				select = arr[i];
				min = Math.abs(arr[i] - second);
			}
		}

		if (select == second)
			sec = 1;
		if (select > 0) {
			if (1 + min > 600)
				System.out.println("-1");
			else
				System.out.println(1 + min);
		} else {
			if (1 + min > 600)
				System.out.println("-1");
			else
				System.out.println(min);
		}

	}
}
