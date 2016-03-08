package chapter02;

public class GoodsTest {
	int test ;
	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.setName( "nikon" );
		camera.setPrice( 100000 );
		camera.setCountSold( 10 );
		camera.setCountStock( 200 );
		
		System.out.println( Goods.countOfGoods );
		
		Goods camera2 = new Goods();
		System.out.println( Goods.countOfGoods );

		Goods camera3 = new Goods();
		System.out.println( Goods.countOfGoods );

		
	}

}
