package input_output.input_streams.buffered_reader.issue.pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import input_output.model.pack.Employee;

public class Solution_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Employee employee = new Employee();

		System.out.println("Enter the Employee Id");
		String empId = reader.readLine();
		employee.setEmpId(empId);

		System.out.println("Enter the Employee Name");
		String empName = reader.readLine();
		employee.setName(empName);

		System.out.println("Enter the Employee Age Between 18 to 100");
		Integer empAge = Integer.parseInt(reader.readLine());
		employee.setAge(empAge);

		System.out.println("Enter the Employee Gender");
		// Solution 1
		char empGender = reader.readLine().charAt(0);
		employee.setGender(empGender);

		System.out.println("Enter the Employee Salary");
		Long empSalary = Long.parseLong(reader.readLine());
		employee.setSalary(empSalary);

		System.out.println("Employee Details Entered :: " + employee);
	}
}
