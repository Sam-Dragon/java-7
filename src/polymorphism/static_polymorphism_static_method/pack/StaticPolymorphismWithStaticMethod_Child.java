package polymorphism.static_polymorphism_static_method.pack;

public class StaticPolymorphismWithStaticMethod_Child extends StaticPolymorphismWithStaticMethod_Parent {

	public static void method() {
		System.out.println("Child Static - Method Overridden");
	}

	public static void child_method(String name) {
		System.out.println("child_method(String name) - Method overloaded");
	}

}
