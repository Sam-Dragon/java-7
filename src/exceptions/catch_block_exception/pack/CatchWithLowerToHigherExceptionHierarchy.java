package exceptions.catch_block_exception.pack;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchWithLowerToHigherExceptionHierarchy {

	public static void main(String[] args) {

		lowerToHigherExceptionHierarchy();
		higherToLowerExceptionHierarchy();
	}

	private static void higherToLowerExceptionHierarchy() {
		try {
			throw new FileNotFoundException();
		} catch (IOException e) {
			System.out.println("IO Exception :: " + e);
		} /*
			 * catch (FileNotFoundException e) {
			 * System.out.println("File Not Found Exception :: " + e); }
			 */
	}

	@SuppressWarnings("hiding")
	private static void lowerToHigherExceptionHierarchy() {
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found Exception :: " + e);
		} catch (IOException e) {
			System.out.println("IO Exception :: " + e);
		} catch (Exception e) {
			System.out.println("Exception :: " + e);
		}
	}

}
