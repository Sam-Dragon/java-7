package exceptions.exception_handling.pack;

import java.util.Scanner;

public class TryWithFinally {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Scanner Open");

		try {
			System.out.println("Scanner Operations");
		} finally {
			System.out.println("Scanner Closed");
			scanner.close();
		}
	}

}
