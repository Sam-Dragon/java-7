package method_overloading_wrappers.pack;

public class MethodOverloadingWithDifferentWrapperAndPrimitiveMethod {

	public void method(String name) {
		System.out.println("Method with Wrapper String Argument");
	}

	public void method(Double i) {
		System.out.println("Method with Wrapper Double Argument");
	}
	
	public void method(Integer i) {
		System.out.println("Method with Wrapper Integer Argument");
	}
}
