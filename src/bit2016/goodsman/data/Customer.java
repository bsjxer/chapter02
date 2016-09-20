package bit2016.goodsman.data;

public class Customer {
	public String name;
	protected String phone;
	private String email;
	
	void setName() {
		// public 은 자기안에서 접근 O
		name = "도우넛";
		// protected 은 자기안에서 접근 O
		phone = "000000000";
		// private 은 자기안에서 접근
		email = "bsjxer@naver.com";
	}
}
