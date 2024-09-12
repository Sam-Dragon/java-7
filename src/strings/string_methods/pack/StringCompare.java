package strings.string_methods.pack;

public class StringCompare {

	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println("String s = " + s);

		String s1 = "hello world";
		System.out.println("String s1 = " + s1);

		int result = s.compareTo(s1);
		System.out.println(s + ".compareTo(" + s1 + ") = " + result);
		
		result = s1.compareTo(s);
		System.out.println(s1 + ".compareTo(" + s + ") = " + result);
		
		result = s1.compareToIgnoreCase(s);
		System.out.println(s1 + ".compareToIgnoreCase(" + s + ") = " + result);
	}
}
