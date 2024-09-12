package polymorphism.dynamic_polymorphism_method_overriding_access.pack;

public class AccessMethodOverriding_Child extends AccessMethodOverriding_Parent {

	@Override
	// protected void display() {
	public void display() {
		System.out.println("Child display");
	}

	// Access of child must be greater than or equal to parent
	// void display() {
}
