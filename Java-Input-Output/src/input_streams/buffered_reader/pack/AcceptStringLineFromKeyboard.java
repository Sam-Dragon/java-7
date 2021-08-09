package input_streams.buffered_reader.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptStringLineFromKeyboard {

	public static void main(String[] args) throws IOException {
		System.out.println("Please Enter the Input from Keyboard");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String string = reader.readLine().split(" ")[0];
		System.out.println("Enter Input String :: " + string);
	}
}
