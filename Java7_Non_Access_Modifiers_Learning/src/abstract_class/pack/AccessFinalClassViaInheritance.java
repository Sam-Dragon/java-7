package abstract_class.pack;

public class AccessFinalClassViaInheritance extends AbstractClass {

	private void method() {
		System.out.println(defaultVariable);
		System.out.println(protectedVariable);

		System.out.println(defaultStaticVariable);
		System.out.println(protectedStaticVariable);

		System.out.println(finalDefaultStaticVariable);
		System.out.println(finalProtectedStaticVariable);

		System.out.println(publicVariable);
		System.out.println(publicStaticVariable);
		System.out.println(finalPublicStaticVariable);

		defaultMethod();
		protectedMethod();
		publicMethod();

		defaultFinalMethod();
		protectedFinalMethod();
		publicFinalMethod();

		defaultStaticMethod();
		protectedStaticMethod();
		publicStaticMethod();

		defaultStaticFinalMethod();
		protectedStaticFinalMethod();
		publicStaticFinalMethod();

	}

	public static void main(String[] args) {
		new AccessFinalClassViaInheritance().method();
	}

//	@Override
//	void abstractMethod() {
//	}

	@Override
	protected void abstractProtectedMethod() {
	}

	@Override
	public void abstractPublicMethod() {
	}
}
