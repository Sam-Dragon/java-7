package polymorphism.dynamic_polymorphism_method_overriding_return_type.pack;

public class ReturnTypeNumberMethodOverriding_Child extends ReturnTypeNumberMethodOverriding_Parent {

	@Override
	public Long display() {
		System.out.println("Child Return Type Number");
		return 100L;
	}

	// Return Type of child must be less than or equal to parent
}
