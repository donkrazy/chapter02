package chapter02;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 1;
		double b = 0;
		try {
			b = 100/a;
			System.out.println( "some more codes...." );
			return;
		} catch( ArithmeticException ex ) {
			System.out.println( "error occurs:" + ex);
		} finally {
			System.out.println( "clean-up code");
		}
		
	}

}
