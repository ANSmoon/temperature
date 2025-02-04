// Author : 문범수
// Date : 2024-01-23
// duration : 60m
// name : 영화매니저 인터페이스
// subject : 추상클래스 & 인터페이스 & 제네릭

package 영화매니저_인터페이스;

import java.util.Arrays;

public class MovieTest {
	public static void main(String[] args) {
		Movie m1 = new Movie();
		m1.setId(1);
		m1.setTitle("어벤져스");
		m1.setDirector("외국인");
		m1.setGenre("SF");
		m1.setRunningTime(160);

		Movie m2 = new Movie(2, "괴물", "봉준호", "SF", 180);

		SeriesMovie m3 = new SeriesMovie(3, "해리포터", "누구더라", "Fantasy", 160, 1, "재밌는 편");

		IMovieManager manage = MovieManagerImpl.getinstance();

		manage.add(m1);
		manage.add(m2);
		manage.add(m3);

		System.out.println(Arrays.toString(manage.getList()));
		System.out.println(Arrays.toString(manage.searchByTitle("괴물")));
	}
}
