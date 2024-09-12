package strings.methods;

public class StringSplit {

	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println("String s = " + s);

		String[] array = s.split("");
		System.out.println("\n<< Array after Split With No Space >>");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		array = s.split(" ");
		System.out.println("\n<< Array after Split With Space >>");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		array = s.split(",");
		System.out.println("\n<< Array after Split With Comma >>");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
