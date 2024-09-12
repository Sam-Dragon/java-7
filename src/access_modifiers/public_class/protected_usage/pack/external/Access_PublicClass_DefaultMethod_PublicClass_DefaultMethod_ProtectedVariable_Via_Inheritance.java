package access_modifiers.public_class.protected_usage.pack.external;

import access_modifiers.public_class.protected_usage.pack.PublicClass_DefaultMethod_ProtectedVariable;

public class Access_PublicClass_DefaultMethod_PublicClass_DefaultMethod_ProtectedVariable_Via_Inheritance
		extends PublicClass_DefaultMethod_ProtectedVariable {

	public void method() {
		System.out.println(protectedVariable);
//		defaultMethod();
	}

	public static void main(String[] args) {
		new Access_PublicClass_DefaultMethod_PublicClass_DefaultMethod_ProtectedVariable_Via_Inheritance().method();
	}
}
