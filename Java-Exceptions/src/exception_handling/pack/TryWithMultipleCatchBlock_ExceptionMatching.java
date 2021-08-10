package exception_handling.pack;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithMultipleCatchBlock_ExceptionMatching {

	@SuppressWarnings("hiding")
	public static void main(String[] args) {
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
