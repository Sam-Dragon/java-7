package exception_handling.pack;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("With Exception");
		withException();
		
		System.out.println("\nWithout Exception");
		withoutException();
	}

	private static void withoutException() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("No Exception");
		} catch (Exception e) {
			System.out.println("Exception Caught :: " + e);
		} finally {
			System.out.println("Resource Closed");
			scanner.close();
		}
	}

	private static void withException() {
		Scanner scanner = new Scanner(System.in);
		try {
			throw new Exception("Throwing Exception");
		} catch (Exception e) {
			System.out.println("Exception Caught :: " + e);
		} finally {
			System.out.println("Resource Closed");
			scanner.close();
		}
	}

}
