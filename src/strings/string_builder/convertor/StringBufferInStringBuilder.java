package strings.string_builder.convertor;

public class StringBufferInStringBuilder {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Buffer");
		System.out.println(buffer.toString());

		StringBuilder builder = new StringBuilder(buffer);
		builder.append(".append(Builder)");
		System.out.println(builder.toString());
	}
}
