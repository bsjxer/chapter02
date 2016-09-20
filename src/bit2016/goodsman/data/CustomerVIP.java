package bit2016.goodsman.data;

public class CustomerVIP extends Customer {
	void setname() {
		// public은 자식 패키지에서 접근 O
		name = "둘리";
		
		// protected는 자식에서 접근이 O
		phone = "01064126495";
		
		// private은 자식에서 접근이 X
		// email = "bsjxer@naver.com";
	}
}
