package access_modifiers.public_class.pack.external;

import access_modifiers.public_class.pack.PublicClass_PublicMethod_DefaultVariable;

public class Access_PublicClass_PublicMethod_DefaultVariable_Via_Inheritance
		extends PublicClass_PublicMethod_DefaultVariable {

	public void method() {
		// System.out.println(defaultVariable);
		publicMethod();
	}

	public static void main(String[] args) {
		new Access_PublicClass_PublicMethod_DefaultVariable_Via_Inheritance().method();
	}
}
