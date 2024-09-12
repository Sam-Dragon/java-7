package strings.methods;

public class StringEquality {

	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println("String s = " + s);

		String s2 = new String("hello world");
		System.out.println(s + ".equalsIgnoreCase(" + s2 + ") = " + s.equalsIgnoreCase(s2));

		String s3 = new String("Hello World");
		System.out.println(s3 + ".equals(" + s + ") = " + s3.equals(s));
	}
}
