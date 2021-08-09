package input_streams.buffered_reader.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptBooleanFromKeyboard {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please Enter the Boolean Input from Keyboard");
		boolean booleanNumber = Boolean.parseBoolean(reader.readLine());
		System.out.println("Boolean Number :: " + booleanNumber);
	}
}
