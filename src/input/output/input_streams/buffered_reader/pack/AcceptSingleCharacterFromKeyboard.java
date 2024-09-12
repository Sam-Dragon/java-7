package input.output.input_streams.buffered_reader.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptSingleCharacterFromKeyboard {

	public static void main(String[] args) throws IOException {
		System.out.println("Please Enter the Input from Keyboard");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int charNumber = reader.read();
		System.out.println("Character Number :: " + charNumber);

		char c = (char) charNumber;
		System.out.println("First Character :: " + c);
	}
}
