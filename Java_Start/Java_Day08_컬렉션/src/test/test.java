package test;

public class test {
	static int ts;
	public static boolean sum(int x, int y) {
		ts = x + y;
		return false;
	}
	
	public static void main(String[] args) {
		sum(1,2);
		System.out.println(sum(1,ts));
	}
}