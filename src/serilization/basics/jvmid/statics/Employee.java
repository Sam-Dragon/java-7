package serilization.basics.jvmid.statics;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static String id;
	private static String name;

	public Employee() {
		System.out.println("Employee()");
	}

	public Employee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("Employee(id, name)");
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
