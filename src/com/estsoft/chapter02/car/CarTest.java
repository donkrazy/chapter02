package com.estsoft.chapter02.car;

public class CarTest {

	public static void main(String[] args) {
		Car c = Car.getInstance();
		Car c1 = Car.getInstance();
		Car c2 = Car.getInstance();
		Car c3 = Car.getInstance();
		
		System.out.println( c );
		System.out.println( c1 );
		System.out.println( c2 );
		System.out.println( c3 );
		
	}

}
