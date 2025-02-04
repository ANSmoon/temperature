// Author : 문범수
// Date : 2024-01-18
// duration : 15m
// name : 상품, 리뷰객체 생성
// subject : 클래스와 객체

package homework;

public class ReviewProduct {
	String pCode, writer, content;
	int reviewid;
	
	ReviewProduct(int reviewid, String pCode, String writer, String content){
		this.pCode = pCode;
		this.reviewid = reviewid;
		this.writer = writer;
		this.content = content;
		}
	
	public ReviewProduct() {}

	@Override
	public String toString() {
		return "ReviewProduct [pCode=" + pCode + ", writer=" + writer + ", content=" + content + ", reviewid="
				+ reviewid + "]";
	}
	
	
}
