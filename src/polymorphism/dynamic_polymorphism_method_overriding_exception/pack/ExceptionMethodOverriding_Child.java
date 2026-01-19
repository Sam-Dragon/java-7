package polymorphism.dynamic_polymorphism_method_overriding_exception.pack;

import java.io.FileNotFoundException;

public class ExceptionMethodOverriding_Child extends ExceptionMethodOverriding_Parent {

	@Override
	public void display() throws FileNotFoundException {
		System.out.println("Child Exception");
	}

	// Exception of child must be less than or equal to parent
	// public void display() throws IOException {
	// public void display() throws Exception {
}
