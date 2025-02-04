package 상품_Collection_실습;

import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class ProductManagerImpl implements IProductManager {
	// list 선언 => ArrayList 클래스로 구현
	// Map 선언 => HashMap 클래스로 구현
	List<Product> products = new ArrayList<>();
	Map<String, List<Review>> reviews = new HashMap<>();

	// IProductManager 선언 => ProductManagerImpl 클래스로 구현
	private static int reviewNo = 0;
	private static IProductManager instance = new ProductManagerImpl();

	// static 으로 외부 접근 유일한 통로 생성
	public static IProductManager getInstance() {
		return instance;
	}

	// private 생성자 선언으로 외부에서 객체 생성 방지
	// == 싱글톤 패턴 구현
	private ProductManagerImpl() {
	}

	// 제품 추가
	@Override
	public boolean addProduct(Product product) {
		if (product != null && products.add(product)) {
			return true;
		} else
			return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getpCode().equals(product.getpCode())) {
				products.set(i, product);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean removdeProduct(String pCode) {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getpCode().equals(pCode)) {
				products.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public int sell(String pCode, int cnt) {
		int price = 0;
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getpCode().equals(pCode)) {
				price = products.get(i).getPrice();
			}
		}
		return (price * cnt);
	}

	@Override
	public Product[] getProductList() {
		Product[] result = new Product[products.size()];
		return products.toArray(result);
	}

	@Override
	public Product searchByCode(String pCode) {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getpCode().equals(pCode)) {
				return products.get(i);
			}
		}
		return null;
	}

	@Override
	public boolean addReview(Review review) {
		if (review != null) {
			String code = review.getpCode();
			 reviews.computeIfAbsent(code, k -> new ArrayList<>()).add(review);
			 reviewNo++;
			 return true;
		}
		return false;
	}

	@Override
	public boolean removeReview(String pCode) {
		if(reviews.containsKey(pCode)) {
	        List<Review> reviewList = reviews.get(pCode);

	        // 리뷰 목록에서 모든 리뷰 제거
	        reviewList.clear();

	        // 해당 키(pCode) 제거
	        reviews.remove(pCode);
			return true;
		}else {
			return false;
		}
	}

	@Override
	public List<Review> getProductReview(String pCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product[] searchByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getTotoalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Product[] getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Refrigerator[] getRefrigerators() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Refrigerator[] getRefrigeratorsFreezer(boolean freezer) {
		// TODO Auto-generated method stub
		return null;
	}

}
