package access_modifiers.public_class.pack.external;

import access_modifiers.public_class.pack.PublicClass_PublicMethod_PublicVariable;

public class Access_PublicClass_PublicMethod_PublicVariable_Via_Inheritance
		extends PublicClass_PublicMethod_PublicVariable {

	public void method() {
		System.out.println(publicVariable);
		publicMethod();
	}

	public static void main(String[] args) {
		new Access_PublicClass_PublicMethod_PublicVariable_Via_Inheritance().method();
	}
}