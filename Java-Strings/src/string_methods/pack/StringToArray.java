package string_methods.pack;

public class StringToArray {

	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println("String s = " + s);

		char[] array = new char[s.length()];
		s.getChars(0, s.length(), array, 0);

		System.out.println("\n<< Array After Updation>>");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}

}
