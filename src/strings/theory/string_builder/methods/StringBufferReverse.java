package strings.theory.string_builder.methods;

public class StringBufferReverse {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("String Buffer");
		System.out.println("Initial = " + stringBuffer.toString());

		System.out.println("\n<< String Builder after Reversing >> ");
		stringBuffer.reverse();
		System.out.println(stringBuffer.toString());
	}
}
