package class05;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.age = 45;
        p.name= "Yang";
        p.hobby="Youtube";
        
        p.study(10); // int형 형변환 없이 호출
        // 묵시적 형변환
        // 만약 전달 인자가 묵시적 형변환 가능할 경우
        
        p.study((byte)1);
        p.study((short)2);
        p.study((char)2);
        
        // method 오버로딩 발생(똑같은 method 여러개 선언)
        // 위에서 묵시적 형변환이 안되기 때문에 아래 long형으로 출력
        p.study(100L); // 100L => long형
        
        p.study("1", 1);
        p.study(1, "1");
        
    }
}
