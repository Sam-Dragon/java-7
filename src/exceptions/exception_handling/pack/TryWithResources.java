package exceptions.exception_handling.pack;

import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {
		System.out.println("Enter The Input");
		try (Scanner scanner = new Scanner(System.in)) {
			String s = scanner.next();
			System.out.println("Entered Input :: " + s);
		}

		// Not Accessible
		// scanner.close()
	}
}
