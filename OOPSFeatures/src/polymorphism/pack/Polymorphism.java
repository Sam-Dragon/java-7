package polymorphism.pack;

public class Polymorphism {

	public static void main(String[] args) {
		System.out.println("Static Polymorphism - Method Overloading");

		StaticPolymorphismChild child = new StaticPolymorphismChild();
		System.out.println("\nChild Method Call");
		child.commonMethod();
		child.commonMethod(10);
		child.commonMethod(100);

		System.out.println("\nParent Method Call");
		child.commonMethod("Parent");

		System.out.println("\nDynamic Polymorphism - Method Overriding");
		DynamicPolymorphismParent child2 = new DynamicPolymorphismChild();
		child2.commonMethod();

		DynamicPolymorphismChild child3 = new DynamicPolymorphismChild();
		child3.commonMethod();
		
		DynamicPolymorphismParent parent1 = new DynamicPolymorphismParent();
		parent1.commonMethod();
	}
}
