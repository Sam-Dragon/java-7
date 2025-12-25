package strings.theory.string_builder.methods;

public class StringBufferCreation {

	public static void main(String[] args) {
		System.out.println("String Builder with No Data");
		StringBuilder stringBuilder = new StringBuilder();
		System.out.println(stringBuilder.capacity());

		System.out.println("\nString Builder with CharSequence");
		CharSequence charSequence = new String("charSequence");
		stringBuilder = new StringBuilder(charSequence);
		System.out.println(stringBuilder.toString());

		System.out.println("\nString Builder with Updated Capacity = 32");
		stringBuilder = new StringBuilder(32);
		System.out.println(stringBuilder.capacity());

		System.out.println("\nString Builder with String");
		stringBuilder = new StringBuilder(new String("1. Filter types in spring [Apart from Authentication Filter]\r\n"
				+ "2. Form Login check in postman\r\n" + "3. Ascii escape in rest template\r\n"
				+ "4. Junit Test cases\r\n" + "5. No-SQL db with spring boot\r\n" + "6. Java 9\r\n" + ""));
		System.out.println(stringBuilder.toString());
	}
}
