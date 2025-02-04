// Author : 문범수
// Date : 2024-01-18
// duration : 30m
// name : 맛집, 리뷰객체 생성
// subject : 클래스와 객체

package homework;

public class Review {
	int reviewid;
	int resid;
	String writer;
	String content;
	
	Review(){}
	Review(int reviewid, int resid, String writer, String content){
		this.reviewid = reviewid;
		this.resid = resid;
		this.writer = writer;
		this.content = content;
	}
	
	//자동 toString 생성
	public String toString() {
		return "Review [reviewid=" + reviewid + ", resid=" + resid + ", writer=" + writer + ", content=" + content
				+ "]";
	}
}
