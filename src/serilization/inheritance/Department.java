package serilization.inheritance;

import java.io.Serializable;

public class Department extends Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	String name;

	public Department() {
		System.out.println("Department()");
	}

	public Department(int weight, String name) {
		super();
		this.weight = weight;
		this.name = name;
		System.out.println("Department(weight, name)");
	}

	@Override
	public String toString() {
		return "Department [name=" + name + "]";
	}
}

class Employee {
	int weight = 42;
}