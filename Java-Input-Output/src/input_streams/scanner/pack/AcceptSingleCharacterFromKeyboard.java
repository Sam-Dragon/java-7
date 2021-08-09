package input_streams.scanner.pack;

import java.io.IOException;
import java.util.Scanner;

public class AcceptSingleCharacterFromKeyboard {

	public static void main(String[] args) throws IOException {
		System.out.println("Please Enter the Input from Keyboard");
		try (Scanner scanner = new Scanner(System.in)) {

			char c = scanner.next().charAt(0);
			System.out.println("First Character :: " + c);
		}
	}
}
