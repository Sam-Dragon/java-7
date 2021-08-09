package string_tokenizer.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import model.pack.Employee;

public class StringTokenizerExample {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the Employee Details");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();

		System.out.println("Enter the Employee(empId, name, age, salary, gender) Details");
		StringTokenizer tokenizer = new StringTokenizer(input, ",");
		
		Employee employee = new Employee(tokenizer.nextToken().trim(), tokenizer.nextToken().trim(),
				Integer.parseInt(tokenizer.nextToken().trim()), Long.parseLong(tokenizer.nextToken().trim()),
				tokenizer.nextToken().trim().charAt(0));
		System.out.println("Employee : " + employee);
	}
}
