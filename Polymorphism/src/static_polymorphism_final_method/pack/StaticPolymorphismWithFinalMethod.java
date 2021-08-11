package static_polymorphism_final_method.pack;

public class StaticPolymorphismWithFinalMethod {

	public static void main(String[] args) {
		System.out.println("Parent method is not called, as there is no access");
		StaticPolymorphismWithFinalMethod_Parent parent = new StaticPolymorphismWithFinalMethod_Child();
//		parent.method();
	}
}
