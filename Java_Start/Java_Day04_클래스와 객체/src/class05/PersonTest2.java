package class05;

public class PersonTest2 {
    public static void main(String[] args) {
//        Person2 p = new Person2(); // 기본 생성자 호출
        // 생성자를 하나라도 만들어서 기본 생성자 생성 안됨.
//        p.age = 45; 			 // 멤버 변수의 초기화 => 생성자.
//        p.name= "Yang";			 
//        p.hobby="Youtube";
        
    	Person2 p = new Person2("Mun", 27, "Game");
    	
    	p.info();
    	
    	Person2 x = new Person2("Mun", 27);
    	
    	x.info();
        
    }
}
