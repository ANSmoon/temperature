package homework_9;

import java.util.Scanner;

public class Multiplication_Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("숫자를 입력하세요 : ");
			int number = sc.nextInt();

			if (number == 0)
				break;

			for (int i = 1; i < 10; i++) {
				System.out.println(number + " * " + i + " = " + number * i);
			}
		}
	}
}