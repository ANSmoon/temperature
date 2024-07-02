// Author : 문범수
// Date : 2024-01-18
// duration : 10m
// name : 영화객체 생성
// subject : 클래스와 method

package homework;

public class Movie {
	int id;
	String title;
	String director;
	String genre;
	int runningTime;
	
	Movie(int id, String title, String director, String genre, int runningTime) {
		this.id = id;
		this.title = title;
		this.director = director;
		this.genre = genre;
		this.runningTime = runningTime;
	}
}
