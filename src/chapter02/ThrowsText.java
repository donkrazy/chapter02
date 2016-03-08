package chapter02;

import java.io.IOException;

public class ThrowsText {
	public void dangerousMethod()throws MyException{
		System.out.println( "some statement" );
		
		if( true ) {
			//throw new IOException();
			throw new MyException( "this is MyException Test" );
		}
		
		System.out.println( "some statement2" );
	}
}
