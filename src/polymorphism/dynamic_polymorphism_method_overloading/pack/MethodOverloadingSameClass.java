package polymorphism.dynamic_polymorphism_method_overloading.pack;

public class MethodOverloadingSameClass {

	public void method(Integer i, String name) {
	}

	public void method(String name, Integer i) {
		System.out.println("Method with different order of arguments");
	}

	public void method(String name, Long i) {
		System.out.println("Method with different datatype of arguments");
	}

	public void method(String name, Long i, Integer x) {
		System.out.println("Method with different number of arguments");
	}
}
