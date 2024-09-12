package serilization.mulitple.hierarchy.parent.serialized.child.not.serialized;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private Department department;

	public Employee() {
		System.out.println("Employee()");
	}

	public Employee(String id, String name, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		System.out.println("Employee(id, name, department)");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}

}
