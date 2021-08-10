package exception_interesting.pack;

public class TryCatchFinallyWithReturnString {

	public static void main(String[] args) {
		System.out.println(returnString());
	}

	@SuppressWarnings("finally")
	private static String returnString() {
		try {
			return "Try";
		} catch (Exception e) {
			return "Catch";
		} finally {
			return "Finally";
		}
	}
}
