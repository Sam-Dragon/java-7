package polymorphism.dynamic_polymorphism_method_overriding_return_type.pack;

public class CovariantReturnTypeMethodOverriding_Child extends CovarientReturnTypeMethodOverriding_Parent {

	@Override
//	public CovarientReturnTypeMethodOverriding_Child display() {
	public CovarientReturnTypeMethodOverriding_Parent display() {
		System.out.println("Parent Return Type Covariant Type");
		return new CovariantReturnTypeMethodOverriding_Child();
	}

	// Access of child must be less than or equal to parent
}
