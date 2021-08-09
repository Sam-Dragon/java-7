package input_streams.scanner.pack;

import java.io.IOException;
import java.util.Scanner;

public class AcceptBooleanFromKeyboard {

	public static void main(String[] args) throws IOException {
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("Please Enter the Boolean Input from Keyboard");
			boolean booleanNumber = scanner.nextBoolean();
			System.out.println("Boolean Number :: " + booleanNumber);
		}
	}
}
