package catch_block_exception.pack;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchingMultipleExceptionWithPipe {

	public static void main(String[] args) {
		try {
			throw new FileNotFoundException();
		} catch (IOException | NullPointerException e) {
			System.out.println("IO Exception :: " + e);
		}
	}
}
