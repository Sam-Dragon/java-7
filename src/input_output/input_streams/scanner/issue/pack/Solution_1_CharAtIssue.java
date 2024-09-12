package input_output.input_streams.scanner.issue.pack;

import java.util.Scanner;

import input_output.model.pack.Employee;

public class Solution_1_CharAtIssue {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			Employee employee = new Employee();

			System.out.println("Enter the Employee Id");
			String empId = scanner.nextLine();
			employee.setEmpId(empId);

			System.out.println("Enter the Employee Name");
			String empName = scanner.nextLine();
			employee.setName(empName);

			System.out.println("Enter the Employee Age Between 18 to 100");
			Integer empAge = scanner.nextInt();
			employee.setAge(empAge);

			System.out.println("Enter the Employee Gender");
			char empGender = scanner.next().charAt(0);
			employee.setGender(empGender);

			System.out.println("Enter the Employee Salary");
			Long empSalary = scanner.nextLong();
			employee.setSalary(empSalary);

			System.out.println("Employee Details Entered :: " + employee);
		}
	}
}