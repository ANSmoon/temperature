package java03_operator;

public class Op02_산술연산자 {
    public static void main(String[] args) {
    	 // 주석에 올바른 실행 결과 값을 채워 넣으시오.
    	
        int a = 10;
        int b = 6;
        
        System.out.println(a + b); // 
        System.out.println(a - b); //  
        System.out.println(a * b); // 
        System.out.println(a / b); // 
        System.out.println(a % b); // 
        
        // 정수 + 실수 => 실수
        // 좀 더 큰 형에 맞춰서 전환된다.
        System.out.println((double)a / b); //
        System.out.println(a / (double)b); //
        System.out.println((double)(a / b)); //
        
        double c = 2.3;
        
        
        System.out.println(a / c); //
        System.out.println(a / (int) c); //
        
        
    }
}
