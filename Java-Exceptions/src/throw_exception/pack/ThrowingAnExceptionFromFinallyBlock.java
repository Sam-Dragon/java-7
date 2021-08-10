package throw_exception.pack;

public class ThrowingAnExceptionFromFinallyBlock {

	public static void main(String[] args) {
		System.out.println("Throwing Exception From Finally Block");
		try {
			throwingNewCheckedException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("finally")
	private static void throwingNewCheckedException() throws Exception {
		try {
			throwingNewCheckedException();
		} finally {
			throw new Exception("Thrown from finally");
		}
	}
}
