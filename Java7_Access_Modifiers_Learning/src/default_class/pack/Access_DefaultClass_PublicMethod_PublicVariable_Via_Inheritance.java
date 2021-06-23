package default_class.pack;

public class Access_DefaultClass_PublicMethod_PublicVariable_Via_Inheritance
		extends DefaultClass_PublicMethod_PublicVariable {

	public void method() {
		System.out.println(publicVariable);
		publicMethod();
	}

	public static void main(String[] args) {
		new Access_DefaultClass_PublicMethod_PublicVariable_Via_Inheritance().method();
	}
}
