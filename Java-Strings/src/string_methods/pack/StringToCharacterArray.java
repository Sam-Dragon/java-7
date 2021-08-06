package string_methods.pack;

public class StringToCharacterArray {

	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println("String s = " + s);

		char[] array = s.toCharArray();
		for (char c : array) {
			System.out.print(c + "|");
		}
	}
}
