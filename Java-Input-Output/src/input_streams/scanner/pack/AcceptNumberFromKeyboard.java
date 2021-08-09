package input_streams.scanner.pack;

import java.util.Scanner;

public class AcceptNumberFromKeyboard {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("Please Enter the Byte Input from Keyboard");
			byte byteNumber = scanner.nextByte();
			System.out.println("Byte Number :: " + byteNumber);

			System.out.println("Please Enter the Short Input from Keyboard");
			short shortNumber = scanner.nextShort();
			System.out.println("Short Number :: " + shortNumber);

			System.out.println("Please Enter the Integer Input from Keyboard");
			int integerNumber = scanner.nextInt();
			System.out.println("Integer Number :: " + integerNumber);

			System.out.println("Please Enter the Long Input from Keyboard");
			long longNumber = scanner.nextLong();
			System.out.println("Long Number :: " + longNumber);

			System.out.println("Please Enter the Float Input from Keyboard");
			float floatNumber = scanner.nextFloat();
			System.out.println("Float Number :: " + floatNumber);

			System.out.println("Please Enter the Double Input from Keyboard");
			double doubleNumber = scanner.nextDouble();
			System.out.println("Double Number :: " + doubleNumber);
		}
	}
}
