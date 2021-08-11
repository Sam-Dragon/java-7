package dynamic_polymorphism_method_overloading_varargs.pack;

public class MethodOverloadingWithWrapperAndPrimitiveMethods {

	public void method(String name) {
		System.out.println("Method with Wrapper Double Argument");
	}

	public void method(Double i) {
		System.out.println("Method with Wrapper Double Argument");
	}

	public void method(double i) {
		System.out.println("Method with Primitive Double Argument");
	}
	
	public void method(int i) {
		System.out.println("Method with Primitive Integer Argument");
	}
}
