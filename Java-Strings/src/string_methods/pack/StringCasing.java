package string_methods.pack;

public class StringCasing {

	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println("String s = " + s);

		String uc = s.toUpperCase();
		System.out.println(s + ".toUpperCase() = " + uc);

		String lc = s.toLowerCase();
		System.out.println(s + ".toLowerCase() = " + lc);
	}
}
