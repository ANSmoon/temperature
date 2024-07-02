package 영화배열_관리;

public class MovieManager {
	int MAX_SIZE = 100;
	int size = 0;
	Movie[] movieList = new Movie[MAX_SIZE];
	
	public void add(Movie movie) {
		if(size < MAX_SIZE) {
			movieList[size++] = movie;
		}
		else System.out.println("그 그만 입력해");
	}
	
	
	public Movie[] getList() {
	    Movie[] result = new Movie[size];
	    System.arraycopy(movieList, 0, result, 0, size);
	    return result;
	}
	
	public Movie searchByTitle(String title) {
		for(int i = 0; i < size; i ++) {
			if(title.equals(movieList[i].getTitle())) {
				return movieList[i];
			}
		}
		return null;
	}
}
