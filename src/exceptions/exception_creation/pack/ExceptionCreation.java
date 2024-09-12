package exceptions.exception_creation.pack;

public class ExceptionCreation {

	public static void main(String[] args) {
		Throwable throwable = new Throwable("Throwable..");
		System.out.println(throwable);

		Error error = new Error("Error..");
		System.out.println(error);

		Exception exception = new Exception("Exception..");
		System.out.println(exception);

		RuntimeException runtimeException = new RuntimeException("Runtime Exception..");
		System.out.println(runtimeException);
	}
}
