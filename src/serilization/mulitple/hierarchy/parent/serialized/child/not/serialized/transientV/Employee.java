package serilization.mulitple.hierarchy.parent.serialized.child.not.serialized.transientV;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private transient Department department;

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

	private void readObject(ObjectInputStream is) {
		try {
			System.out.println("readObject(ObjectInputStream)");
			is.defaultReadObject();
			this.department = new Department(is.readInt());
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

	private void writeObject(ObjectOutputStream os) {
		try {
			System.out.println("writeObject(ObjectOutputStream)");
			os.defaultWriteObject();
			os.writeInt(this.getDepartment().getId());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
