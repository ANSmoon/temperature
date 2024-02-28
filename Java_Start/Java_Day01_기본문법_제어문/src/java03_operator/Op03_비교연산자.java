package java03_operator;

public class Op03_비교연산자 {

    public static void main(String[] args) {
    	 // 주석에 올바른 실행 결과 값을 채워 넣으시오.
        int a = 10;
        
        System.out.println(a > 10); // 
        System.out.println(a <= 10); // 
        System.out.println(a >= 10); // 
        System.out.println(a == 10); // 
        System.out.println(a != 10); // 
        
        // **** 문자열은 어떻게 비교하는가? ****
        String c=  "Hi";
        String d = "Hi";
        String e = new String("Hi");
        
        // java에서 문자열의 비교는 ==, !=로 하지 않는다!
        // .equals를 사용해서 비교한다.
        
        System.out.println(c == d); // 
        System.out.println(c == e); // 
        System.out.println(c.equals(e)); // ==
        System.out.println(!c.equals(e)); // !=
        
        
    }
}
