package bit2016.goodsman.main;

import bit2016.goodsman.data.Goods;

public class GoodsApp {

	public static void main(String[] args) {
		Goods goods = new Goods();
		goods.setName( "Nikon" );
		// goods.Price = -1;
		goods.setPrice( 2000 );
		goods.setCountStock( 50 );
		goods.setCountSold( 10 );
		System.out.println( Goods.count );
		System.out.println(
				goods.getName() + ":" +
				goods.getPrice() + ":" + 
				goods.getCountStock() + ":" + 
				goods.getCountSold() );
		
		Goods goods2 = new Goods();
		System.out.println( Goods.count );
		
		goods.showInfo();
		
		int discountPrice = (int)(0.1 * goods.getPrice());
//		int discountPrice = goods.calcDiscountPrice( 0.1 );
//		System.out.println( discountPrice );
		
	}
}
