package bit2016.goodsman.main;

import bit2016.goodsman.data.Goods;

public class GoodsApp {

	public static void main(String[] args) {
		Goods goods = new Goods();
		goods.setName( "Nikon" );
		// goods.Price = -1;
		goods.setPrice( -1 );
		goods.setCountStock( 50 );
		goods.setCountSold( 10 );
		
		System.out.println(
				goods.getName() + ":" +
				goods.getPrice() + ":" + 
				goods.getCountStock() + ":" + 
				goods.getCountSold() );
	}
}