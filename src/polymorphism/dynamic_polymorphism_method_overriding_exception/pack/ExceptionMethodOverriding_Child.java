package polymorphism.dynamic_polymorphism_method_overriding_exception.pack;

import java.io.FileNotFoundException;

public class ExceptionMethodOverriding_Child extends ExceptionMethodOverriding_Parent {

	@Override
	public void display() throws FileNotFoundException {
		System.out.println("Child Exception");
	}

	// Access of child must be greater than or equal to parent
	// public void display() throws IOException {
	// public void display() throws Exception {
}
