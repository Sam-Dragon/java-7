package oops.concepts.polymorphism.pack;

public class Polymorphism {

	public static void main(String[] args) {
		System.out.println("\nDynamic Polymorphism - Method Overriding");
		DynamicPolymorphismParent child2 = new DynamicPolymorphismChild();
		child2.commonMethod();

		DynamicPolymorphismChild child3 = new DynamicPolymorphismChild();
		child3.commonMethod();
		
		DynamicPolymorphismParent parent1 = new DynamicPolymorphismParent();
		parent1.commonMethod();
	}
}
