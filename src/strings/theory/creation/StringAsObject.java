package strings.theory.creation;

public class StringAsObject {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = new String("abc");

		System.out.println("s1.hashCode() = " + System.identityHashCode(s1));
		System.out.println("s2.hashCode() = " + System.identityHashCode(s2));

		System.out.println("Do == [Address] check to confirm, it is not in STRING CONSTANT POOL");
		System.out.println("(s1 == s2) = " + (s1 == s2));

		System.out.println("\nMove non-string pool into string pool using 'intern' method");
		
//		s1 = s1.intern();
//		System.out.println("s1.hashCode() = " + System.identityHashCode(s1));
		s2 = s2.intern();
		System.out.println("s2.hashCode() = " + System.identityHashCode(s2));
		
		System.out.println("Do == [Address] check to confirm, it is not in STRING CONSTANT POOL");
		System.out.println("(s1 == s2) = " + (s1 == s2));	
	}

}
