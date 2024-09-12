package polymorphism.static_polymorphism_static_method.pack;

public class StaticPolymorphismWithStaticMethod {

	public static void main(String[] args) {
		System.out.println("Child method is not called, even if there is child object");
		StaticPolymorphismWithStaticMethod_Parent parent = new StaticPolymorphismWithStaticMethod_Child();
		parent.method();

		StaticPolymorphismWithStaticMethod_Parent.method();
	}
}
