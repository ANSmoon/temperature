package java03_operator;

public class Op04_논리연산자 {
	public static void main(String[] args) {

		// 주석에 올바른 실행 결과 값을 채워 넣으시오.

		System.out.println(true && true); //
		System.out.println(true && false); //
		System.out.println(false && true); //
		System.out.println(false && false); //

		System.out.println(true || true); //
		System.out.println(true || false); //
		System.out.println(false || true); //
		System.out.println(false || false); //

		int a = 10;
		int b = 20;

		System.out.println(a > b && a++ > b); //
		System.out.println(a); //
		System.out.println(a < b && a++ < b); //
		System.out.println(a); //

		System.out.println(a > b || a++ > b); //
		System.out.println(a); //
		System.out.println(a < b || a++ < b); //
		System.out.println(a); //

		System.out.println("-----");
	}
}
