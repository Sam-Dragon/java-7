package string_buffer_methods.pack;

public class StringBufferDelete {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("String Buffer with Delete");
		System.out.println("Initial = " + stringBuffer.toString());

		System.out.println("\n<< String Builder after Delete (stringBuffer.length() - 11, stringBuffer.length()) >> ");
		stringBuffer.delete(stringBuffer.length() - 11, stringBuffer.length());
		System.out.println(stringBuffer.toString());

		System.out.println();
		stringBuffer = new StringBuffer("String Buffer with Delete");
		System.out.println("Initial = " + stringBuffer.toString());
		
		System.out.println("\n<< String Builder after Delete (0, 6) >> ");
		stringBuffer.delete(0, 6);
		System.out.println(stringBuffer.toString());
	}
}
