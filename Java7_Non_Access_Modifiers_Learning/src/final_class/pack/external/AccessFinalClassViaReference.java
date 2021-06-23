package final_class.pack.external;

import final_class.pack.FinalClass;

public class AccessFinalClassViaReference {

	private void method() {

		// Rest all cannot be accessed from Final Class

		FinalClass classObj = new FinalClass();
		System.out.println(classObj.publicStaticVariable);
		System.out.println(classObj.publicVariable);
		System.out.println(classObj.finalPublicStaticVariable);

//		classObj.defaultMethod();
//		classObj.protectedMethod();
		classObj.publicMethod();

//		classObj.defaultFinalMethod();
//		classObj.protectedFinalMethod();
		classObj.publicFinalMethod();

//		classObj.defaultStaticMethod();
//		classObj.protectedStaticMethod();
		classObj.publicStaticMethod();

//		classObj.defaultStaticFinalMethod();
//		classObj.protectedStaticFinalMethod();
		classObj.publicStaticFinalMethod();

	}

	public static void main(String[] args) {
		new AccessFinalClassViaReference().method();
	}
}
