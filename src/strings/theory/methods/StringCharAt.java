package strings.theory.methods;

public class StringCharAt {

	public static void main(String[] args) {
		String s = "Hello World";
		char c = s.charAt(6);
		System.out.println("Hello World.charAt(6) = " + c);
		
		c = s.charAt(s.length() - 1);
		System.out.println(s + ".charAt(s.length() - 1) = " + c);
		
		c = s.charAt(s.length());
		System.out.println(s + ".charAt(s.length()) = " + c);
	}
}
