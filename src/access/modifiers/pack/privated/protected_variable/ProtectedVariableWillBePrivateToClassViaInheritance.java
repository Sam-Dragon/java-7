package access.modifiers.pack.privated.protected_variable;

import public_class.protected_usage.pack.PublicClass_DefaultMethod_ProtectedVariable;

public class ProtectedVariableWillBePrivateToClassViaInheritance extends PublicClass_DefaultMethod_ProtectedVariable {

	private String variable = protectedVariable;
	
	public void method() {
		method(variable);
	}

	public void method(String variable) {
		System.out.println("Accessed Variable = " + protectedVariable);
	}

	public static void main(String[] args) {
		new ProtectedVariableWillBePrivateToClassViaInheritance().method();
	}
}
