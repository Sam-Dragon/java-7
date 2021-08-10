package exception_interesting.pack;

public class FinallyWontRunOnThreadStop {

	public static void main(String[] args) {
		try {
			System.out.println("Finally Wont run on calling System.exit");
			Thread.currentThread().stop();
		} finally {
			System.out.println("Finally");
		}
	}
}
