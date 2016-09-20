package bit2016.goodsman.db;

import bit2016.goodsman.data.Customer;

public class CustomerDB {
	void insert() {
		Customer c = new Customer();
		
		// public은 다른 패키지에서 접근 O
		c.name = "안대혁";
		
		// protected 는 다른 패키지에서는 접근 X
		// c.phone = "01064126495";
		
		// private 은 다른 패키지에서 접근 X
		// c.email = "bsjxer@naver.com";
	}
}
