// Author : 문범수
// Date : 2024-01-23
// duration : 60m
// name : 사용자매니저 인터페이스
// subject : 추상클래스 & 인터페이스 & 제네릭

package 사용자매니저_인터페이스;

public class  VipUser extends User{
	private String grade;
	private int point;

	public VipUser() {
		super();
	}

	public VipUser(String id, String password, String name, String email, int age, String grade, int point) {
		super(id, password, name, email, age);
		this.grade = grade;
		this.point = point;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "VipUser [" + super.toString() + "grade = "+ grade + ", point=" + point  + "]";
	}
	
	
}
