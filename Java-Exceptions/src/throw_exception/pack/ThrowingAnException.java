package throw_exception.pack;

import custom_exception.pack.CustomException;

public class ThrowingAnException {

	public static void main(String[] args) {
		System.out.println("Throwing Checked Exception");
		try {
			throwingNewCheckedException();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("\nThrowing Unchecked Exception");
		try {
			throwingNewRuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("\nThrowing Custom Exception");
		try {
			throwingNewCustomException();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("\nReThrowing Exception");
		try {
			reThrowingAnException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void throwingNewCustomException() throws CustomException {
		throw new CustomException("Throwing New Custom Exception");
	}

	private static void throwingNewRuntimeException() {
		throw new RuntimeException("Throwing New Runtime Exception");
	}

	private static void throwingNewCheckedException() throws Exception {
		throw new Exception("Throwing New Checked Exception");
	}

	private static void reThrowingAnException() throws Exception {
		try {
			throw new Exception("Re-Throwing Exception");
		} catch (Exception e) {
			throw e;
		}
	}

}
