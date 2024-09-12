package exceptions.exception_interesting.pack;

public class TryCatchFinallyWithReturn {

	public static void main(String[] args) {

		try {
			System.out.println("Finally Wont run on calling System.exit");
			System.exit(0);
		} finally {
			System.out.println("Finally");
		}
	}
}
