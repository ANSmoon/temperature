package java02_variable;

public class Var02_TypeCasting {
	public static void main(String[] args) {
		
		// 1. Implicit Casting
		int n1 = 100;
		long n2 = n1;
		
		// 2. Explicit Casting
		int n3 = 100;
		byte n4 = (byte) n3;
		
		System.out.println(n2 + ", " + n4);
	}
}
