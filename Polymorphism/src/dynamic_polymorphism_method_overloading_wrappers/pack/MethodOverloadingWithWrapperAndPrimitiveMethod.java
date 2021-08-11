package dynamic_polymorphism_method_overloading_wrappers.pack;

public class MethodOverloadingWithWrapperAndPrimitiveMethod {
	public void method(Double i) {
		System.out.println("Method with Wrapper Double Argument");
	}

	public void method(double i) {
		System.out.println("Method with Primitive Double Argument");
	}
}
