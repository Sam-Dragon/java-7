package exceptions.exception_methods.pack;

public class ExceptionMethods {

	public static void main(String[] args) {
		Exception exception = new Exception("<< Exception >>");
		System.out.println(exception);

		System.out.println("\nException Object");
		exceptionObject(exception);
		
		System.out.println("\nException Message");
		getMessage(exception);
		
		System.out.println("\nException Stacktrace");
		printStackTrace(exception);

	}

	private static void exceptionObject(Exception exception) {
		System.out.println(exception);
	}

	private static void getMessage(Exception exception) {
		System.out.println(exception.getMessage());
	}

	private static void printStackTrace(Exception exception) {
		exception.printStackTrace();
	}
}
