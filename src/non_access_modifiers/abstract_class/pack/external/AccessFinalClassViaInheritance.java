package non_access_modifiers.abstract_class.pack.external;

import non_access_modifiers.abstract_class.pack.AbstractClass;

public class AccessFinalClassViaInheritance extends AbstractClass {

	private void method() {
//		System.out.println(defaultVariable);
		System.out.println(protectedVariable);
		System.out.println(publicVariable);
		
//		System.out.println(defaultStaticVariable);
		System.out.println(protectedStaticVariable);
		System.out.println(publicStaticVariable);

//		System.out.println(finalDefaultStaticVariable);
		System.out.println(finalProtectedStaticVariable);
		System.out.println(finalPublicStaticVariable);

//		defaultMethod();
		protectedMethod();
		publicMethod();

//		defaultFinalMethod();
		protectedFinalMethod();
		publicFinalMethod();

//		defaultStaticMethod();
		protectedStaticMethod();
		publicStaticMethod();

//		defaultStaticFinalMethod();
		protectedStaticFinalMethod();
		publicStaticFinalMethod();

	}

	public static void main(String[] args) {
		new AccessFinalClassViaInheritance().method();
	}

//	@Override
//	void abstractMethod() {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	protected void abstractProtectedMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abstractPublicMethod() {
		// TODO Auto-generated method stub
		
	}
}
