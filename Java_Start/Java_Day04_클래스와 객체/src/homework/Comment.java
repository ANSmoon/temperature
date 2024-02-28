// Author : 문범수
// Date : 2024-01-18
// duration : 20m
// name : 게시판 객체 생성실습
// subject : 클래스와 객체

package homework;

import java.util.Date;

public class Comment {
	int commentid, articleid, userSeq;
	String content;
	Date regDate = new Date();
	
	Comment(){}
	Comment(int commentid, int articleid, int userSeq, String content){
		this.commentid = commentid;
		this.articleid = articleid;
		this.userSeq = userSeq;
		this.content = content;
	}
	@Override
	public String toString() {
		return "Comment [commentid=" + commentid + ", articleid=" + articleid + ", userSeq=" + userSeq + ", content="
				+ content + ", regDate=" + regDate + "]";
	}
}
