// Author : 문범수
// Date : 2024-01-18
// duration : 15m
// name : 상품, 리뷰객체 생성
// subject : 클래스와 객체

package homework;

public class Product {
	String pCode, pName, brand, desc;
	int price, quantity;
	
	Product(String pCode, String pName, int price, int quantity, String brand, String desc){
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.quantity = quantity;
		this.brand = brand;
		this.desc = desc;
		}
	
	Product(){}

	@Override
	public String toString() {
		return "Product [pCode=" + pCode + ", pName=" + pName + ", price=" + price + ", quantity=" + quantity
				+ ", brand=" + brand + ", desc=" + desc + "]";
	}
}
