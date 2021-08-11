package dynamic_polymorphism_method_overloading_wrappers.pack;

public class MethodOverloadingMain {

	public static void main(String[] args) {
		System.out.println("\nPrimitive Vs Wrapper as argument");
		
		System.out.println("\nPrimitive Vs Wrapper as argument of Same Type");
		MethodOverloadingWithWrapperAndPrimitiveMethod methods = new MethodOverloadingWithWrapperAndPrimitiveMethod();
		methods.method(0D);
		methods.method(0d);
		methods.method(0L);
		methods.method(0f);
		methods.method(0.00);

		System.out.println();
		methods.method(new Double(0));
		methods.method(Double.valueOf(0));

		System.out.println("\nSpecial Case");
		methods.method(null);
		
		System.out.println("\nWrapper as argument of Different Type");
		MethodOverloadingWithDifferentWrapperAndPrimitiveMethod method = new MethodOverloadingWithDifferentWrapperAndPrimitiveMethod();
		method.method(0);
//		method.method(0L);
		method.method(0D);
		
		System.out.println("\nSpecial Case");
		// method.method(null);
		
		
	}
}
