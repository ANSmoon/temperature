// Author : 문범수
// Date : 2024-01-18
// duration : 30m
// name : 도서객체 생성
// subject : 클래스와 method

package homework;

public class BookTest {
	public static void main(String[] args) {
		
		Book bk1 = new Book("21424","Java Pro", "김하나", "jaen.kr",15000,"Java 기본 문법");
		Book bk2 = new Book("35355","분석설계  ", "소나  ", "jaen.kr",30000,"SW 모델링");
		
		System.out.println("***************도서목록***********");
		System.out.println(bk1.toString());
		System.out.println(bk2.toString());
	}
}
