package string_buffer_methods.pack;

public class StringBufferInsert {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("String Buffer with insert");
		System.out.println("Initial = " + stringBuffer.toString());

		System.out.println("\n<< String Builder after insert (stringBuffer.length() - 11, stringBuffer.length()) >> ");
		stringBuffer.insert(stringBuffer.length() - 11, stringBuffer.length());
		System.out.println(stringBuffer.toString());

		System.out.println();
		stringBuffer = new StringBuffer("String Buffer with Delete");
		System.out.println("Initial = " + stringBuffer.toString());
		
		System.out.println("\n<< String Builder after insert (0, 6) >> ");
		stringBuffer.insert(0, 6);
		System.out.println(stringBuffer.toString());
	}
}
