package strings.theory.methods;

public class StringIndexBeginAndEnd {

	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println("String s = " + s);

		System.out.println("\n<< BEGIN INDEX >>");
		int bi = s.indexOf("l");
		System.out.println(s + ".indexOf(\"l\") = " + (bi + 1));

		System.out.println("\n<< ENDING INDEX >>");
		int li = s.lastIndexOf("l");
		System.out.println(s + ".endsWith(\"l\") = " + (li + 1));
	}
}
