// Author : 문범수
// Date : 2024-01-18
// duration : 30m
// name : 맛집, 리뷰객체 생성
// subject : 클래스와 객체

package homework;

public class Restaurant {
	int resid;
	String name;
	String address;
	String signatureMenu;
	int rate;
	
	Restaurant() {}
	Restaurant(int resid, String name, String address, String signatureMenu, int rate){
		this.resid = resid;
		this.name = name;
		this.address = address;
		this.signatureMenu = signatureMenu;
		this.rate = rate;
	}
	
	//자동 toString 생성
	public String toString() {
		return "Restaurant [resid=" + resid + ", name=" + name + ", address=" + address + ", signatureMenu="
				+ signatureMenu + ", rate=" + rate + "]";
	}
}
