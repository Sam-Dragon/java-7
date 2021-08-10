package rethrow_exception.pack;

import custom_exception.pack.CustomException;

public class ReThrowingAnException {

	public static void main(String[] args) {
		System.out.println("\nReThrowing Checked Exception");
		try {
			reThrowingCheckedException();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("\nReThrowing Unchecked Exception");
		try {
			reThrowingUnCheckedException();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("\nReThrowing Custom Exception");
		try {
			reThrowingUnCustomException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void reThrowingUnCustomException() throws CustomException {
		try {
			throw new CustomException("Re-Throwing Checked Exception");
		} catch (Exception e) {
			throw e;
		}
	}

	private static void reThrowingCheckedException() throws Exception {
		try {
			throw new Exception("Re-Throwing Checked Exception");
		} catch (Exception e) {
			throw e;
		}
	}

	private static void reThrowingUnCheckedException() {
		try {
			throw new RuntimeException("Re-Throwing Runtime Exception");
		} catch (Exception e) {
			throw e;
		}
	}
}
