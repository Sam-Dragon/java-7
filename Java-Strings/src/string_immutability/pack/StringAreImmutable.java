package string_immutability.pack;

public class StringAreImmutable {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";

		System.out.println("s1.hashCode() = " + System.identityHashCode(s1));
		System.out.println("s2.hashCode() = " + System.identityHashCode(s2));

		System.out.println("Do == [Address] check to confirm, it is in STRING CONSTANT POOL");
		System.out.println("(s1 == s2) = " + (s1 == s2));

		String s3 = "abc";
		System.out.println("\nUpdated s1 address = " + System.identityHashCode(s1));

		System.out.println("Do == [Address] check to confirm, it is in STRING CONSTANT POOL");
		System.out.println("(s1 == s3) = " + (s1 == s3));
	}

}
