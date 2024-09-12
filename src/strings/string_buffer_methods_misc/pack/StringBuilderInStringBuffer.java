package strings.string_buffer_methods_misc.pack;

public class StringBuilderInStringBuffer {

	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder("Builder");
		System.out.println(builder.toString());

		StringBuffer buffer = new StringBuffer(builder);
		buffer.append(".append(Buffer)");
		System.out.println(buffer.toString());
	}
}
