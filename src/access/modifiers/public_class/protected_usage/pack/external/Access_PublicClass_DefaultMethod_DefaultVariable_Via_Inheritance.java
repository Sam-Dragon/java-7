package access.modifiers.public_class.protected_usage.pack.external;

import access.modifiers.public_class.protected_usage.pack.PublicClass_DefaultMethod_DefaultVariable;

public class Access_PublicClass_DefaultMethod_DefaultVariable_Via_Inheritance
		extends PublicClass_DefaultMethod_DefaultVariable {

	public void method() {
//		System.out.println(defaultVariable);
//		defaultMethod();
	}

	public static void main(String[] args) {
		new Access_PublicClass_DefaultMethod_DefaultVariable_Via_Inheritance().method();
	}
}
