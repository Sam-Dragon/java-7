package string_methods.pack;

public class StringSubString {

	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println("String s = " + s);

		String ss = s.substring(5);
		System.out.println(s + ".substring(5) = " + ss);

		String sss = s.substring(0, 6);
		System.out.println(s + ".substring(0, 6) = " + sss);

		String ssl = s.substring(s.length());
		System.out.println(s + ".substring(s.length()) = " + ssl);

		String sso = s.substring(0);
		System.out.println(s + ".substring(0) = " + sso);

		System.out.println("\n<< OVERLOADED VERSION >>");

		String ssll = s.substring(s.length(), s.length());
		System.out.println(s + ".substring(s.length(), s.length()) = " + ssll);

		String ssoo = s.substring(0, 0);
		System.out.println(s + ".substring(0, 0) = " + ssoo);

		String ssp = s.substring(0, 12);
		System.out.println(s + ".substring(0, 12) = " + ssp);
	}
}
