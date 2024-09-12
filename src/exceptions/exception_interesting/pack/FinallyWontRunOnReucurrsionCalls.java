package exceptions.exception_interesting.pack;

public class FinallyWontRunOnReucurrsionCalls {

	public static void main(String[] args) {
		recurrsiveCall();
	}

	private static void recurrsiveCall() {
		try {
			System.out.println("Finally Wont run on calling System.exit");
			recurrsiveCall();
		} finally {
			System.out.println("Finally");
		}
	}

}
