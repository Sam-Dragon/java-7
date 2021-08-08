package string_creation.pack;

public class StringWithByteArrayArgument {

	public static void main(String[] args) {
		System.out.println("Converting String Builder To String");
		convertingStringBuilderToString();
		System.out.println();
		System.out.println("Converting String Buffer To String");
		convertingStringBufferToString();
	}

	private static void convertingStringBufferToString() {
		StringBuffer buffer = new StringBuffer("String Buffer");
		System.out.println("String Buffer = " + buffer.toString());

		String s = new String(buffer);
		System.out.println("String s = " + s);
	}

	private static void convertingStringBuilderToString() {
		StringBuilder builder = new StringBuilder("String Builder");
		System.out.println("String Builder = " + builder.toString());

		String s = new String(builder);
		System.out.println("String s = " + s);
	}

}
