package string_creation.pack;

public class StringWithStringBufferOrStringBuilderAsArgument {

	public static void main(String[] args) {
		byte[] array = new byte[] { 'W', 'E', 'L', 'C', 'O', 'M', 'E' };
		String s = new String(array);

		System.out.println("Stirng s = " + s);
	}

}
