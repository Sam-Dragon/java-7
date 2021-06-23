package final_class.pack;

public class AccessFinalClassViaReference {

	public static void main(String[] args) {
		// Rest all cannot be accessed from Final Class

		FinalClass classObj = new FinalClass();
		System.out.println(classObj.defaultVariable);
		System.out.println(classObj.protectedVariable);

		System.out.println(classObj.defaultStaticVariable);
		System.out.println(classObj.protectedStaticVariable);

		System.out.println(classObj.finalDefaultStaticVariable);
		System.out.println(classObj.finalProtectedStaticVariable);

		System.out.println(classObj.publicVariable);
		System.out.println(classObj.publicStaticVariable);
		System.out.println(classObj.finalPublicStaticVariable);

		classObj.defaultMethod();
		classObj.protectedMethod();
		classObj.publicMethod();

		classObj.defaultFinalMethod();
		classObj.protectedFinalMethod();
		classObj.publicFinalMethod();

		classObj.defaultFinalMethod();
		classObj.protectedFinalMethod();
		classObj.publicFinalMethod();

		classObj.defaultStaticFinalMethod();
		classObj.protectedStaticFinalMethod();
		classObj.publicStaticFinalMethod();

	}
}
