package bit2016.goodsman.data;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	// 정보 은닉화. 내부 데이터는 private 설정 하고 메소드를 통해 접근한다. 메소드를 통해 접근하면 데이터를 보호 할 수 있다.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		// 정보 보호
		if( price < 0 ) {
			price = 0;
		}
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	
	
}
