package access_modifiers.public_class.pack;

public class Access_PublicClass_DefaultMethod_PublicVariable_Via_Inheritance
		extends PublicClass_DefaultMethod_PublicVariable {

	public void method() {
		System.out.println(publicVariable);
		defaultMethod();
	}

	public static void main(String[] args) {
		new Access_PublicClass_DefaultMethod_PublicVariable_Via_Inheritance().method();
	}
}
