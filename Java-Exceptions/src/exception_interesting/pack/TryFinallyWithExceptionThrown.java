package exception_interesting.pack;

public class TryFinallyWithExceptionThrown {

	@SuppressWarnings("finally")
	public static void main(String[] args) throws Exception {

		try {
			System.out.println("try");
			return;
		} catch (Exception e) {
			System.out.println("catch");
			return;
		} finally {
			System.out.println("finally");
			return;
		}
	}
}
