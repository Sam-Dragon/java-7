package polymorphism.static_polymorphism_static_method.pack;

public class StaticPolymorphismWithStaticMethod_Parent {

	public static void method() {
		System.out.println("Parent Static - Method Overridden");
	}
	
	public static void parent_method(String name) {
		System.out.println("parent_method(String name) - Method overloaded");
	}
}
