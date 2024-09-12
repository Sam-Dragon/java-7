package input.output.output_streams.display.pack;

public class StringFormatClass {

	public static void main(String[] args) {
		int n = 100;
		float f = 100.1f;
		String s = "Rahul Sheth";
		char c = 'M';
		boolean b = true;

		System.out.printf("Integer n = %10d%n", n);
		System.out.printf("Float f = %-10f%n", f);
		System.out.printf("String s = +%s%n", s);
		System.out.printf("Character c = -%c%n", c);
		System.out.printf("Boolean b = %b%n", b);
	}
}
