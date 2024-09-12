package polymorphism.dynamic_polymorphism_method_overloading_varargs.pack;

public class MethodOverloadingMain {

	public static void main(String[] args) {
		System.out.println("\nPrimitive Vs Wrapper as arguments");
		MethodOverloadingWithWrapperAndPrimitiveMethods methods = new MethodOverloadingWithWrapperAndPrimitiveMethods();
		methods.method(0D);
		methods.method(0);

		System.out.println();
		methods.method(new Double(0));
		methods.method(Double.valueOf(0));

		System.out.println("Special Case");
		// methods.method(null);
	}
}
