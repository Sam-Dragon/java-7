package polymorphism.dynamic_polymorphism_method_overriding_return_type.pack;

public class CovarientReturnTypeMethodOverriding_Parent {

	public CovarientReturnTypeMethodOverriding_Parent display() {
		System.out.println("Parent Return Type Covariant Type");
		return new CovarientReturnTypeMethodOverriding_Parent();
	}
}
