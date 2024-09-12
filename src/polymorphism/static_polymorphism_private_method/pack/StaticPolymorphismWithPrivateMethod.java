package polymorphism.static_polymorphism_private_method.pack;

public class StaticPolymorphismWithPrivateMethod {

	public static void main(String[] args) {
		System.out.println("Parent method is not called, as there is no access");
		StaticPolymorphismWithPrivateMethod_Parent parent = new StaticPolymorphismWithPrivateMethod_Child();
//		parent.method();
	}
}
