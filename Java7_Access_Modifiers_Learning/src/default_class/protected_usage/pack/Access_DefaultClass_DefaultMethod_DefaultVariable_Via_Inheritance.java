package default_class.protected_usage.pack;

public class Access_DefaultClass_DefaultMethod_DefaultVariable_Via_Inheritance
		extends DefaultClass_DefaultMethod_DefaultVariable {

	public void method() {
		System.out.println(defaultVariable);
		defaultMethod();
	}

	public static void main(String[] args) {
		new Access_DefaultClass_DefaultMethod_DefaultVariable_Via_Inheritance().method();
	}
}
