package strings.problems;

public class StringLosesUpgradeWithoutReference {

	public static void main(String[] args) {
		// First Object = Object One
		String objOne = "Object One";

		// Second Object = Object Two
		String objTwo = objOne + " Object Two";
		// Third Object = Object One Object Two
		System.out.println(objTwo);

		// Fourth Object = OBJECT ONE OBJECT TWO [LOST]
		objTwo.toUpperCase();
		System.out.println("[LOST] objTwo.toUpperCase() = " + objTwo);
	}
}
