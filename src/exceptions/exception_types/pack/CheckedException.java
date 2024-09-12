package exceptions.exception_types.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			reader.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
