package polymorphism.dynamic_polymorphism_method_overloading.pack;

public class MethodOverloadingMain {

	public static void main(String[] args) {
		MethodOverloadingNonImpactedOnClass sameClass = new MethodOverloadingNonImpactedOnClass();
		sameClass.method(new Short((short) 1));
		sameClass.method(Short.valueOf((short) 1));

		System.out.println();
		try {
			sameClass.method(100);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println();
		// Default Access
		sameClass.method(1L);
	}
}
