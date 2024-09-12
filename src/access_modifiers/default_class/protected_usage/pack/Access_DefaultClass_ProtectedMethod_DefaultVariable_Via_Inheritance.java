package access_modifiers.default_class.protected_usage.pack;

public class Access_DefaultClass_ProtectedMethod_DefaultVariable_Via_Inheritance
		extends DefaultClass_ProtectedMethod_DefaultVariable {

	public void method() {
		System.out.println(defaultVariable);
		protectedMethod();
	}

	public static void main(String[] args) {
		new Access_DefaultClass_ProtectedMethod_DefaultVariable_Via_Inheritance().method();
	}
}
