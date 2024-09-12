package strings.string_objects_created_internally.pack;

public class StringObjectCreatedInternally {

	public static void main(String[] args) {

		// First Object = Object One
		String objOne = "Object One";
		System.out.println(objOne);

		// Second Object = Object Two
		// Third Object = Object One Object Two
		String objTwo = objOne + " Object Two";
		System.out.println(objTwo);

		// Fourth Object = OBJECT ONE OBJECT TWO [LOST]
		objTwo.toUpperCase();
		System.out.println("[LOST] objTwo.toUpperCase() = " + objTwo);

		// Fifth Object = object one object two
		objTwo.toLowerCase();
		System.out.println("[LOST] objTwo.toLowerCase() = " + objTwo);

		// Six Object = Object Five [LOST]
		// Six Object = object one object two Object Five [LOST]
		objTwo.concat("Object Five");
		System.out.println("[LOST] objTwo.concat(\"Object Five\") = " + objTwo);
	}
}
