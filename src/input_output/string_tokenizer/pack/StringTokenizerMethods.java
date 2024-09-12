package input_output.string_tokenizer.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringTokenizerMethods {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the Employee Details");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();

		System.out.println();
		hasMoreTokens(input);

		System.out.println();
		hasMoreElements(input);
		
		System.out.println();
		countTokens(input);
	}

	private static void countTokens(String input) {
		System.out.println("\nEnter the Employee(empId, name, age, salary, gender) Details");
		StringTokenizer tokenizer = new StringTokenizer(input, ",");

		System.out.println(tokenizer.countTokens());
	}

	private static void hasMoreElements(String input) {
		System.out.println("\nEnter the Employee(empId, name, age, salary, gender) Details");
		StringTokenizer tokenizer = new StringTokenizer(input, ",");

		while (tokenizer.hasMoreElements()) {
			Object token = tokenizer.nextElement();
			System.out.print(token + ", ");
		}
	}

	private static void hasMoreTokens(String input) {
		System.out.println("\nEnter the Employee(empId, name, age, salary, gender) Details");
		StringTokenizer tokenizer = new StringTokenizer(input, ",");

		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.print(token + ", ");
		}
	}
}
