package strings.theory.methods;

public class StringConcat {

	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println("String s = " + s);

		String n = s.concat(" Java ");
		System.out.println(s + ".concat(\" Java \") = " + n);
		
		String o = s += " Java ";
		System.out.println(s + ".concat(\" Java \") = " + o);
	}
}
