package throws_exception.pack;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThowsMultipleException {

	public static void main(String[] args) {
		try {
			throwingExceptions();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		throwingRuntimExceptions();

	}

	private static void throwingExceptions() throws FileNotFoundException, IOException {
		throw new FileNotFoundException("Throwing File Not Found Exception");
	}

	private static void throwingRuntimExceptions() throws RuntimeException {
		throw new RuntimeException("Throwing Runtime Exception");
	}
}
