package input_output.input_streams.buffered_reader.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptStringFromKeyboard {

	public static void main(String[] args) throws IOException {
		System.out.println("Please Enter the Input from Keyboard");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String charNumber = reader.readLine();
		System.out.println("Enter Input String :: " + charNumber);
	}
}
