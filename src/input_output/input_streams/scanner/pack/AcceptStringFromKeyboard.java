package input_output.input_streams.scanner.pack;

import java.io.IOException;
import java.util.Scanner;

public class AcceptStringFromKeyboard {

	public static void main(String[] args) throws IOException {
		System.out.println("Please Enter the Input from Keyboard");
		try (Scanner scanner = new Scanner(System.in)) {

			String string = scanner.next();
			System.out.println("Enter Input String :: " + string);
		}
	}
}
