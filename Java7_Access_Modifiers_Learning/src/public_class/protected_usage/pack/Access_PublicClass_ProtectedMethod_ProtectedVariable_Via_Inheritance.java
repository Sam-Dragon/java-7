package public_class.protected_usage.pack;

public class Access_PublicClass_ProtectedMethod_ProtectedVariable_Via_Inheritance
		extends PublicClass_ProtectedMethod_ProtectedVariable {

	public void method() {
		System.out.println(protectedVariable);
		protectedMethod();
	}

	public static void main(String[] args) {
		new Access_PublicClass_ProtectedMethod_ProtectedVariable_Via_Inheritance().method();
	}
}
