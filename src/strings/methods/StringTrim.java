package strings.methods;

public class StringTrim {

	public static void main(String[] args) {
		String s = " Hello  World ";
		System.out.println("String s = " + s);

		String ts = s.trim();
		System.out.println(s + ".trim() = " + ts);
	}
}
