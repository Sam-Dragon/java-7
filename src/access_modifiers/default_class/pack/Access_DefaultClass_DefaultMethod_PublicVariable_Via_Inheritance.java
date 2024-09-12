package access_modifiers.default_class.pack;

public class Access_DefaultClass_DefaultMethod_PublicVariable_Via_Inheritance
		extends DefaultClass_DefaultMethod_PublicVariable {

	public void method() {
		System.out.println(publicVariable);
		defaultMethod();
	}

	public static void main(String[] args) {
		new Access_DefaultClass_DefaultMethod_PublicVariable_Via_Inheritance().method();
	}
}
