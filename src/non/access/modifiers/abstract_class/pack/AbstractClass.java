package non.access.modifiers.abstract_class.pack;

public abstract class AbstractClass {

	static String defaultStaticVariable = "Default Static Variable";
	protected static String protectedStaticVariable = "Protected Static Variable";
	public static String publicStaticVariable = "Public Static Variable";

	String defaultVariable = "Default Variable";
	protected String protectedVariable = "Protected Variable";
	public String publicVariable = "Public Variable";

	static final String finalDefaultStaticVariable = "Final Default Static Variable";
	protected static final String finalProtectedStaticVariable = "Final Protected Static Variable";
	public static final String finalPublicStaticVariable = "Final Public Static Variable";

	void defaultMethod() {
		System.out.println("Default Method");
	}

	static void defaultStaticMethod() {
		System.out.println("Default Static Method");
	}

	protected void protectedMethod() {
		System.out.println("Protected Method");
	}

	protected static void protectedStaticMethod() {
		System.out.println("Protected Static Method");
	}

	public void publicMethod() {
		System.out.println("Public Method");
	}

	public static void publicStaticMethod() {
		System.out.println("Public Static Method");
	}

	final void defaultFinalMethod() {
		System.out.println("Default Final Method");
	}

	static final void defaultStaticFinalMethod() {
		System.out.println("Default Static Final Method");
	}

	protected final void protectedFinalMethod() {
		System.out.println("Protected Final Method");
	}

	protected static final void protectedStaticFinalMethod() {
		System.out.println("Protected Static Final Method");
	}

	public final void publicFinalMethod() {
		System.out.println("Public Final Method");
	}

	public static final void publicStaticFinalMethod() {
		System.out.println("Public Static Final Method");
	}

//	abstract void abstractMethod();

	protected abstract void abstractProtectedMethod();

	public abstract void abstractPublicMethod();

//	abstract static void abstractStaticMethod();
//	abstract final void abstractFinalMethod();
}
