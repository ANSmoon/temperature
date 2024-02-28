// 클래스 선언자 : public class

public class Person {
	// 묶어서 관리할 data
	// => 멤버 변수(feild) : 객체가 갖고 있는 data, 속성
	String name;
	int age;
	String hobby;
	
	// method => class 안에 정의된 함수
	// 멤버 method : 객체가 가지고 있는 method
	
	void info() {
		// 멤버 method => 멤버 변수에 바로 접근 가능
		System.out.println("이름은 " + name + "이고, 나이는 " + age + "새 취미는 " + hobby + "입니다.");
	}
	
	static void hello() {
		System.out.println("Hello world!");
	}
	
}
