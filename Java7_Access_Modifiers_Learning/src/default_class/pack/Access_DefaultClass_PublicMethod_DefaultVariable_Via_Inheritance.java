package default_class.pack;

public class Access_DefaultClass_PublicMethod_DefaultVariable_Via_Inheritance
		extends DefaultClass_PublicMethod_DefaultVariable {

	public void method() {
		System.out.println(defaultVariable);
		publicMethod();
	}

	public static void main(String[] args) {
		new Access_DefaultClass_PublicMethod_DefaultVariable_Via_Inheritance().method();
	}
}
