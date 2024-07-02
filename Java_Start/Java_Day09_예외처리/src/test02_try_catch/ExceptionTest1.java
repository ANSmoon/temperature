package test02_try_catch;

public class ExceptionTest1 {
	public static void main(String[] args) {
		// try ~ catch 문을 이용한 예외 처리
		int[] nums = {10};
		
		// 1. 예외 발생 후 제대로 처리 : 1, 4, 5
		// 2. 예외가 발생했지만 처리하지 못한 경우 : 1 -> 2(에러발생) 비정상적 종료
		// 3. 예외 발생 안한 경우 : 1, 2, 3, 5
		
		
		try {
			// 예외 발생할 수 있는 코드를 try에 넣는다.
			System.out.println("정상코드 1"); // 1
			System.out.println(nums[3]);	// 2
			System.out.println("정상코드 2"); // 3
		}catch(ArrayIndexOutOfBoundsException |ArithmeticException e) { // catch() 예외를 파라미터로 받는다.
			// 예외 대처 코드 작성
			System.out.println("배열 인덱스 범위 초과"); // 4
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 종료."); // 5
	}
}
