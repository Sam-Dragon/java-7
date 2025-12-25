package strings.theory.methods;

public class StringReplace {

	public static void main(String[] args) {
		String s = "Hello World Java World ";
		System.out.println("String s = " + s);

		String r = s.replace('W', '*');
		System.out.println(s + ".replace('W', '*') = " + r);

		String ra = s.replaceAll("Wo", "**");
		System.out.println(s + ".replaceAll(\"Wo\", \"**\") = " + ra);

		String rf = s.replaceFirst("Wo", "**");
		System.out.println(s + ".replaceFirst(\"Wo\", \"**\") = " + rf);
	}
}
