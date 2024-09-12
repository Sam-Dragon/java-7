package input_output.input_streams.buffered_reader.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptNumberFromKeyboard {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please Enter the Byte Input from Keyboard");
		byte byteNumber = Byte.parseByte(reader.readLine());
		System.out.println("Byte Number :: " + byteNumber);

		System.out.println("Please Enter the Short Input from Keyboard");
		short shortNumber = Short.parseShort(reader.readLine());
		System.out.println("Short Number :: " + shortNumber);

		System.out.println("Please Enter the Integer Input from Keyboard");
		int integerNumber = Integer.parseInt(reader.readLine());
		System.out.println("Integer Number :: " + integerNumber);

		System.out.println("Please Enter the Long Input from Keyboard");
		long longNumber = Long.parseLong(reader.readLine());
		System.out.println("Long Number :: " + longNumber);

		System.out.println("Please Enter the Float Input from Keyboard");
		float floatNumber = Float.parseFloat(reader.readLine());
		System.out.println("Float Number :: " + floatNumber);

		System.out.println("Please Enter the Double Input from Keyboard");
		double doubleNumber = Double.parseDouble(reader.readLine());
		System.out.println("Double Number :: " + doubleNumber);
	}
}
