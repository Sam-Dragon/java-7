package string_methods.pack;

public class StringBeginAndEndMatching {

	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println("String s = " + s);

		System.out.println("\n<< STARTS WITH >>");
		boolean sw = s.startsWith("H");
		System.out.println(s + ".startsWith(\"H\") = " + sw);
		
		sw = s.startsWith("H", 3);
		System.out.println(s + ".startsWith(\"H\") = " + sw);

		System.out.println("\n<< ENDS WITH >>");
		boolean ew = s.endsWith("d");
		System.out.println(s + ".endsWith(\"d\") = " + ew);
	}
}
