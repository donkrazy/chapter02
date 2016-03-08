package chapter02;

import java.io.*;

public class Echo {

	public static void main(String[] args) {
		InputStreamReader input = new InputStreamReader(System.in);

		BufferedReader reader = new BufferedReader(input);
		String keyboardinput = "";
		try {
			keyboardinput = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.print(keyboardinput);
		System.out.println("has entered.");

	}

}
