package strings.theory.string_buffer.methods;

public class StringBufferAppend {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("String Buffer");
		System.out.println("Initial = " + stringBuffer.toString());

		System.out.println("\n<< String Builder after Appending >> ");
		stringBuffer.append(" -- Append Operation Called");
		System.out.println(stringBuffer.toString());
	}
}
