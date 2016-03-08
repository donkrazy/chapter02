package chapter02;

import java.io.IOException;

public class ThrowsTextTest {

	public static void main(String[] args) {
		
		ThrowsText tt = new ThrowsText();
		try {
			tt.dangerousMethod();
		} catch( Exception ex ) {
			ex.printStackTrace();
		}
	}

}
